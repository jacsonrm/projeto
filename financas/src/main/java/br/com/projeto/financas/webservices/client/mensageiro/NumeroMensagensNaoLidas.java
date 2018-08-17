package br.com.projeto.financas.webservices.client.mensageiro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for numeroMensagensNaoLidas complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="numeroMensagensNaoLidas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numeroMensagensNaoLidas", propOrder = {
        "loginUsuario"
})
public class NumeroMensagensNaoLidas {

    protected String loginUsuario;

    /**
     * Gets the value of the loginUsuario property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLoginUsuario() {
        return loginUsuario;
    }

    /**
     * Sets the value of the loginUsuario property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLoginUsuario(String value) {
        this.loginUsuario = value;
    }

}
