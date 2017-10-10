
package br.com.dijalmasilva.soap.hotel.ws;

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
@WebServiceClient(name = "HotelServiceService", targetNamespace = "http://ws.hotel.soap.dijalmasilva.com.br/", wsdlLocation = "http://localhost:8080/soap-hotel/HotelServiceService?wsdl")
public class HotelServiceService
    extends Service
{

    private final static URL HOTELSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException HOTELSERVICESERVICE_EXCEPTION;
    private final static QName HOTELSERVICESERVICE_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "HotelServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/soap-hotel/HotelServiceService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HOTELSERVICESERVICE_WSDL_LOCATION = url;
        HOTELSERVICESERVICE_EXCEPTION = e;
    }

    public HotelServiceService() {
        super(__getWsdlLocation(), HOTELSERVICESERVICE_QNAME);
    }

    public HotelServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns HotelService
     */
    @WebEndpoint(name = "HotelServicePort")
    public HotelService getHotelServicePort() {
        return super.getPort(new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "HotelServicePort"), HotelService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelService
     */
    @WebEndpoint(name = "HotelServicePort")
    public HotelService getHotelServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "HotelServicePort"), HotelService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HOTELSERVICESERVICE_EXCEPTION!= null) {
            throw HOTELSERVICESERVICE_EXCEPTION;
        }
        return HOTELSERVICESERVICE_WSDL_LOCATION;
    }

}