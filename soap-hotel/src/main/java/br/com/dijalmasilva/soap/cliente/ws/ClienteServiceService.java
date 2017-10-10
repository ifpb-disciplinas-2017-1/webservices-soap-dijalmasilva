
package br.com.dijalmasilva.soap.cliente.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ClienteServiceService", targetNamespace = "http://ws.cliente.soap.dijalmasilva.com.br/", wsdlLocation = "http://localhost:8080/soap-cliente/ClienteServiceService?wsdl")
public class ClienteServiceService
    extends Service
{

    private final static URL CLIENTESERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException CLIENTESERVICESERVICE_EXCEPTION;
    private final static QName CLIENTESERVICESERVICE_QNAME = new QName("http://ws.cliente.soap.dijalmasilva.com.br/", "ClienteServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/soap-cliente/ClienteServiceService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CLIENTESERVICESERVICE_WSDL_LOCATION = url;
        CLIENTESERVICESERVICE_EXCEPTION = e;
    }

    public ClienteServiceService() {
        super(__getWsdlLocation(), CLIENTESERVICESERVICE_QNAME);
    }

    public ClienteServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ClienteService
     */
    @WebEndpoint(name = "ClienteServicePort")
    public ClienteService getClienteServicePort() {
        return super.getPort(new QName("http://ws.cliente.soap.dijalmasilva.com.br/", "ClienteServicePort"), ClienteService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClienteService
     */
    @WebEndpoint(name = "ClienteServicePort")
    public ClienteService getClienteServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.cliente.soap.dijalmasilva.com.br/", "ClienteServicePort"), ClienteService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CLIENTESERVICESERVICE_EXCEPTION!= null) {
            throw CLIENTESERVICESERVICE_EXCEPTION;
        }
        return CLIENTESERVICESERVICE_WSDL_LOCATION;
    }

}
