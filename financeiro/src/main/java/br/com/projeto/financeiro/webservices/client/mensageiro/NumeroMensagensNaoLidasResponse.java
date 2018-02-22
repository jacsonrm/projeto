
package br.jus.tjpr.biblioteca.webservices.client.mensageiro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for numeroMensagensNaoLidasResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="numeroMensagensNaoLidasResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroMensagensNaoLidas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numeroMensagensNaoLidasResponse", propOrder = {
    "numeroMensagensNaoLidas"
})
public class NumeroMensagensNaoLidasResponse {

    @XmlElement(name = "NumeroMensagensNaoLidas")
    protected Integer numeroMensagensNaoLidas;

    /**
     * Gets the value of the numeroMensagensNaoLidas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroMensagensNaoLidas() {
        return numeroMensagensNaoLidas;
    }

    /**
     * Sets the value of the numeroMensagensNaoLidas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroMensagensNaoLidas(Integer value) {
        this.numeroMensagensNaoLidas = value;
    }

}
