package uy.com.bse.business.support;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.apache.logging.log4j.Logger;

import uy.com.bse.dto.common.ErrorDTO;
import uy.com.bse.exception.BusinessException;

@LoggingBusinessInterceptorBinding
@Interceptor
public class LoggingBusinessInterceptor {
	@Inject
	private Logger logger;

	@PostConstruct
	public void postConstruct(InvocationContext ic) throws Exception {
		String clase = ic.getTarget().getClass().getCanonicalName();

		logger.debug("NEGOCIO - Inicio PostConstruct " + clase);
		try {
			ic.proceed();
		} catch (Exception e) {
			logger.error("NEGOCIO - Error en PostConstruct " + clase, e);
			throw e;
		} finally {
			logger.debug("NEGOCIO - Fin PostConstruct " + clase);
		}
	}

	@AroundInvoke
	public Object profile(InvocationContext ic) throws Exception {
		String metodo = ic.getTarget().getClass().getCanonicalName() + "." + ic.getMethod().getName();

		Object obj = null;
		try {
			obj = ic.proceed();
		} catch (BusinessException pe) {
			ErrorDTO errorDTO = pe.getError();
			Boolean fatal = errorDTO.getFatal();
			String message = metodo + ", traceNumber: " + errorDTO.getErrorTraceNumber()
					+ ", message: " + errorDTO.getMessage() + ", fatal: " + errorDTO.getFatal() + ", internalMessage: "
					+ pe.getMessage();
			if (fatal) {
				logger.error("NEGOCIO - Error FATAL en método: " + message, pe);
			} else {
				logger.error("NEGOCIO - Error NO FATAL en método: " + message);
			}
			throw pe;
		}
		return obj;
	}
}