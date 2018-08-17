package br.com.projeto.financas.webservices.client.mensageiro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for enviarMensagem complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="enviarMensagem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="senhaSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="tipoMensagem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *         &lt;element name="prioridade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *         &lt;element name="assunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="texto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="logins" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="nomeAnexos" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="anexos" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="loginUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enviarMensagem", propOrder = {
        "loginSistema",
        "senhaSistema",
        "tipoMensagem",
        "prioridade",
        "assunto",
        "texto",
        "logins",
        "nomeAnexos",
        "anexos",
        "loginUsuario"
})
public class EnviarMensagem {

    protected String loginSistema;
    protected String senhaSistema;
    protected Integer tipoMensagem;
    protected Integer prioridade;
    protected String assunto;
    protected String texto;
    @XmlElement(nillable = true)
    protected List<String> logins;
    @XmlElement(nillable = true)
    protected List<String> nomeAnexos;
    @XmlElement(nillable = true)
    protected List<String> anexos;
    protected String loginUsuario;

    /**
     * Gets the value of the loginSistema property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLoginSistema() {
        return loginSistema;
    }

    /**
     * Sets the value of the loginSistema property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLoginSistema(String value) {
        this.loginSistema = value;
    }

    /**
     * Gets the value of the senhaSistema property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSenhaSistema() {
        return senhaSistema;
    }

    /**
     * Sets the value of the senhaSistema property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSenhaSistema(String value) {
        this.senhaSistema = value;
    }

    /**
     * Gets the value of the tipoMensagem property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getTipoMensagem() {
        return tipoMensagem;
    }

    /**
     * Sets the value of the tipoMensagem property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setTipoMensagem(Integer value) {
        this.tipoMensagem = value;
    }

    /**
     * Gets the value of the prioridade property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getPrioridade() {
        return prioridade;
    }

    /**
     * Sets the value of the prioridade property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setPrioridade(Integer value) {
        this.prioridade = value;
    }

    /**
     * Gets the value of the assunto property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * Sets the value of the assunto property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAssunto(String value) {
        this.assunto = value;
    }

    /**
     * Gets the value of the texto property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Sets the value of the texto property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTexto(String value) {
        this.texto = value;
    }

    /**
     * Gets the value of the logins property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logins property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogins().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getLogins() {
        if (logins == null) {
            logins = new ArrayList<String>();
        }
        return this.logins;
    }

    /**
     * Gets the value of the nomeAnexos property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nomeAnexos property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNomeAnexos().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getNomeAnexos() {
        if (nomeAnexos == null) {
            nomeAnexos = new ArrayList<String>();
        }
        return this.nomeAnexos;
    }

    /**
     * Gets the value of the anexos property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anexos property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnexos().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getAnexos() {
        if (anexos == null) {
            anexos = new ArrayList<String>();
        }
        return this.anexos;
    }

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
