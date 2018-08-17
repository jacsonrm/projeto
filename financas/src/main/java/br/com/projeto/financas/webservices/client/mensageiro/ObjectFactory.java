package br.com.projeto.financas.webservices.client.mensageiro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the br.jus.tjpr.biblioteca.webservices.client.mensageiro package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NumeroMensagensNaoLidasResponse_QNAME = new QName("http://impl.mensagem.webservices.mensageiro.tjpr.gov/", "numeroMensagensNaoLidasResponse");
    private final static QName _EnviarMensagemResponse_QNAME = new QName("http://impl.mensagem.webservices.mensageiro.tjpr.gov/", "enviarMensagemResponse");
    private final static QName _ExisteUsuarioResponse_QNAME = new QName("http://impl.mensagem.webservices.mensageiro.tjpr.gov/", "existeUsuarioResponse");
    private final static QName _NumeroMensagensNaoLidas_QNAME = new QName("http://impl.mensagem.webservices.mensageiro.tjpr.gov/", "numeroMensagensNaoLidas");
    private final static QName _Exception_QNAME = new QName("http://impl.mensagem.webservices.mensageiro.tjpr.gov/", "Exception");
    private final static QName _EnviarMensagem_QNAME = new QName("http://impl.mensagem.webservices.mensageiro.tjpr.gov/", "enviarMensagem");
    private final static QName _ExisteUsuario_QNAME = new QName("http://impl.mensagem.webservices.mensageiro.tjpr.gov/", "existeUsuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.jus.tjpr.biblioteca.webservices.client.mensageiro
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnviarMensagemResponse }
     */
    public EnviarMensagemResponse createEnviarMensagemResponse() {
        return new EnviarMensagemResponse();
    }

    /**
     * Create an instance of {@link NumeroMensagensNaoLidasResponse }
     */
    public NumeroMensagensNaoLidasResponse createNumeroMensagensNaoLidasResponse() {
        return new NumeroMensagensNaoLidasResponse();
    }

    /**
     * Create an instance of {@link ExisteUsuarioResponse }
     */
    public ExisteUsuarioResponse createExisteUsuarioResponse() {
        return new ExisteUsuarioResponse();
    }

    /**
     * Create an instance of {@link NumeroMensagensNaoLidas }
     */
    public NumeroMensagensNaoLidas createNumeroMensagensNaoLidas() {
        return new NumeroMensagensNaoLidas();
    }

    /**
     * Create an instance of {@link ExisteUsuario }
     */
    public ExisteUsuario createExisteUsuario() {
        return new ExisteUsuario();
    }

    /**
     * Create an instance of {@link EnviarMensagem }
     */
    public EnviarMensagem createEnviarMensagem() {
        return new EnviarMensagem();
    }

    /**
     * Create an instance of {@link Exception }
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumeroMensagensNaoLidasResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/", name = "numeroMensagensNaoLidasResponse")
    public JAXBElement<NumeroMensagensNaoLidasResponse> createNumeroMensagensNaoLidasResponse(NumeroMensagensNaoLidasResponse value) {
        return new JAXBElement<NumeroMensagensNaoLidasResponse>(_NumeroMensagensNaoLidasResponse_QNAME, NumeroMensagensNaoLidasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarMensagemResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/", name = "enviarMensagemResponse")
    public JAXBElement<EnviarMensagemResponse> createEnviarMensagemResponse(EnviarMensagemResponse value) {
        return new JAXBElement<EnviarMensagemResponse>(_EnviarMensagemResponse_QNAME, EnviarMensagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExisteUsuarioResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/", name = "existeUsuarioResponse")
    public JAXBElement<ExisteUsuarioResponse> createExisteUsuarioResponse(ExisteUsuarioResponse value) {
        return new JAXBElement<ExisteUsuarioResponse>(_ExisteUsuarioResponse_QNAME, ExisteUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumeroMensagensNaoLidas }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/", name = "numeroMensagensNaoLidas")
    public JAXBElement<NumeroMensagensNaoLidas> createNumeroMensagensNaoLidas(NumeroMensagensNaoLidas value) {
        return new JAXBElement<NumeroMensagensNaoLidas>(_NumeroMensagensNaoLidas_QNAME, NumeroMensagensNaoLidas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarMensagem }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/", name = "enviarMensagem")
    public JAXBElement<EnviarMensagem> createEnviarMensagem(EnviarMensagem value) {
        return new JAXBElement<EnviarMensagem>(_EnviarMensagem_QNAME, EnviarMensagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExisteUsuario }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/", name = "existeUsuario")
    public JAXBElement<ExisteUsuario> createExisteUsuario(ExisteUsuario value) {
        return new JAXBElement<ExisteUsuario>(_ExisteUsuario_QNAME, ExisteUsuario.class, null, value);
    }

}
