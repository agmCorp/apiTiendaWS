
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramProCarta2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramProCarta2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mibse.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="cdCarta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="poliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ramo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramProCarta2", propOrder = {
    "cdCarta",
    "certificado",
    "poliza",
    "ramo"
})
public class ParamProCarta2
    extends ParamGenerico
{

    protected String cdCarta;
    protected Integer certificado;
    protected String poliza;
    protected Integer ramo;

    /**
     * Obtiene el valor de la propiedad cdCarta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCarta() {
        return cdCarta;
    }

    /**
     * Define el valor de la propiedad cdCarta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCarta(String value) {
        this.cdCarta = value;
    }

    /**
     * Obtiene el valor de la propiedad certificado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCertificado() {
        return certificado;
    }

    /**
     * Define el valor de la propiedad certificado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCertificado(Integer value) {
        this.certificado = value;
    }

    /**
     * Obtiene el valor de la propiedad poliza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliza() {
        return poliza;
    }

    /**
     * Define el valor de la propiedad poliza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliza(String value) {
        this.poliza = value;
    }

    /**
     * Obtiene el valor de la propiedad ramo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRamo() {
        return ramo;
    }

    /**
     * Define el valor de la propiedad ramo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRamo(Integer value) {
        this.ramo = value;
    }

}
