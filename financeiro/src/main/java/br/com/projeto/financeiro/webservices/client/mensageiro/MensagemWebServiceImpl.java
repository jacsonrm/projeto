
package br.jus.tjpr.biblioteca.webservices.client.mensageiro;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MensagemWebServiceImpl", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MensagemWebServiceImpl {


    /**
     * 
     * @param assunto
     * @param texto
     * @param prioridade
     * @param nomeAnexos
     * @param anexos
     * @param logins
     * @param loginUsuario
     * @param loginSistema
     * @param tipoMensagem
     * @param senhaSistema
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "enviarMensagem", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/", className = "br.jus.tjpr.biblioteca.webservices.client.mensageiro.EnviarMensagem")
    @ResponseWrapper(localName = "enviarMensagemResponse", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/", className = "br.jus.tjpr.biblioteca.webservices.client.mensageiro.EnviarMensagemResponse")
    @Action(input = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/MensagemWebServiceImpl/enviarMensagemRequest", output = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/MensagemWebServiceImpl/enviarMensagemResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/MensagemWebServiceImpl/enviarMensagem/Fault/Exception")
    })
    public void enviarMensagem(
        @WebParam(name = "loginSistema", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/")
        String loginSistema,
        @WebParam(name = "senhaSistema", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/")
        String senhaSistema,
        @WebParam(name = "tipoMensagem", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/")
        Integer tipoMensagem,
        @WebParam(name = "prioridade", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/")
        Integer prioridade,
        @WebParam(name = "assunto", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/")
        String assunto,
        @WebParam(name = "texto", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/")
        String texto,
        @WebParam(name = "logins", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/")
        List<String> logins,
        @WebParam(name = "nomeAnexos", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/")
        List<String> nomeAnexos,
        @WebParam(name = "anexos", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/")
        List<String> anexos,
        @WebParam(name = "loginUsuario", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/")
        String loginUsuario)
        throws Exception_Exception
    ;

    /**
     * 
     * @param loginUsuario
     * @return
     *     returns java.lang.Integer
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "NumeroMensagensNaoLidas", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/")
    @RequestWrapper(localName = "numeroMensagensNaoLidas", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/", className = "br.jus.tjpr.biblioteca.webservices.client.mensageiro.NumeroMensagensNaoLidas")
    @ResponseWrapper(localName = "numeroMensagensNaoLidasResponse", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/", className = "br.jus.tjpr.biblioteca.webservices.client.mensageiro.NumeroMensagensNaoLidasResponse")
    @Action(input = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/MensagemWebServiceImpl/numeroMensagensNaoLidasRequest", output = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/MensagemWebServiceImpl/numeroMensagensNaoLidasResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/MensagemWebServiceImpl/numeroMensagensNaoLidas/Fault/Exception")
    })
    public Integer numeroMensagensNaoLidas(
        @WebParam(name = "loginUsuario", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/")
        String loginUsuario)
        throws Exception_Exception
    ;

    /**
     * 
     * @param login
     * @return
     *     returns java.lang.Integer
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "ExisteUsuario", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/")
    @RequestWrapper(localName = "existeUsuario", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/", className = "br.jus.tjpr.biblioteca.webservices.client.mensageiro.ExisteUsuario")
    @ResponseWrapper(localName = "existeUsuarioResponse", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/", className = "br.jus.tjpr.biblioteca.webservices.client.mensageiro.ExisteUsuarioResponse")
    @Action(input = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/MensagemWebServiceImpl/existeUsuarioRequest", output = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/MensagemWebServiceImpl/existeUsuarioResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/MensagemWebServiceImpl/existeUsuario/Fault/Exception")
    })
    public Integer existeUsuario(
        @WebParam(name = "login", targetNamespace = "http://impl.mensagem.webservices.mensageiro.tjpr.gov/")
        String login)
        throws Exception_Exception
    ;

}