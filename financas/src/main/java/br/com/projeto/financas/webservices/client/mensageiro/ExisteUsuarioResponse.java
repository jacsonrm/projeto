package br.com.projeto.financas.webservices.client.mensageiro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for existeUsuarioResponse complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="existeUsuarioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExisteUsuario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "existeUsuarioResponse", propOrder = {
        "existeUsuario"
})
public class ExisteUsuarioResponse {

    @XmlElement(name = "ExisteUsuario")
    protected Integer existeUsuario;

    /**
     * Gets the value of the existeUsuario property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getExisteUsuario() {
        return existeUsuario;
    }

    /**
     * Sets the value of the existeUsuario property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setExisteUsuario(Integer value) {
        this.existeUsuario = value;
    }

}
