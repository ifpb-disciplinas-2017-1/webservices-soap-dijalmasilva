
package br.com.dijalmasilva.soap.cliente.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ClienteService", targetNamespace = "http://ws.cliente.soap.dijalmasilva.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClienteService {


    /**
     * 
     * @param arg0
     * @return
     *     returns br.com.dijalmasilva.soap.cliente.ws.Cliente
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByCpf", targetNamespace = "http://ws.cliente.soap.dijalmasilva.com.br/", className = "br.com.dijalmasilva.soap.cliente.ws.FindByCpf")
    @ResponseWrapper(localName = "findByCpfResponse", targetNamespace = "http://ws.cliente.soap.dijalmasilva.com.br/", className = "br.com.dijalmasilva.soap.cliente.ws.FindByCpfResponse")
    public Cliente findByCpf(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns br.com.dijalmasilva.soap.cliente.ws.Cliente
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "edit", targetNamespace = "http://ws.cliente.soap.dijalmasilva.com.br/", className = "br.com.dijalmasilva.soap.cliente.ws.Edit")
    @ResponseWrapper(localName = "editResponse", targetNamespace = "http://ws.cliente.soap.dijalmasilva.com.br/", className = "br.com.dijalmasilva.soap.cliente.ws.EditResponse")
    public Cliente edit(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Cliente arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns br.com.dijalmasilva.soap.cliente.ws.Cliente
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findById", targetNamespace = "http://ws.cliente.soap.dijalmasilva.com.br/", className = "br.com.dijalmasilva.soap.cliente.ws.FindById")
    @ResponseWrapper(localName = "findByIdResponse", targetNamespace = "http://ws.cliente.soap.dijalmasilva.com.br/", className = "br.com.dijalmasilva.soap.cliente.ws.FindByIdResponse")
    public Cliente findById(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<br.com.dijalmasilva.soap.cliente.ws.Cliente>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://ws.cliente.soap.dijalmasilva.com.br/", className = "br.com.dijalmasilva.soap.cliente.ws.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://ws.cliente.soap.dijalmasilva.com.br/", className = "br.com.dijalmasilva.soap.cliente.ws.FindAllResponse")
    public List<Cliente> findAll();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "delete", targetNamespace = "http://ws.cliente.soap.dijalmasilva.com.br/", className = "br.com.dijalmasilva.soap.cliente.ws.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://ws.cliente.soap.dijalmasilva.com.br/", className = "br.com.dijalmasilva.soap.cliente.ws.DeleteResponse")
    public void delete(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "save", targetNamespace = "http://ws.cliente.soap.dijalmasilva.com.br/", className = "br.com.dijalmasilva.soap.cliente.ws.Save")
    @ResponseWrapper(localName = "saveResponse", targetNamespace = "http://ws.cliente.soap.dijalmasilva.com.br/", className = "br.com.dijalmasilva.soap.cliente.ws.SaveResponse")
    public void save(
        @WebParam(name = "arg0", targetNamespace = "")
        Cliente arg0);

}
