package com.webservice.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2015-11-29T23:59:55.709+08:00
 * Generated source version: 2.5.9
 * 
 */
@WebServiceClient(name = "SayHelloImplService", 
                  wsdlLocation = "http://localhost:8080/cxf_webservice_spring/SayHelloWS?wsdl",
                  targetNamespace = "http://ws.webservice.com/") 
public class SayHelloImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.webservice.com/", "SayHelloImplService");
    public final static QName SayHelloImplPort = new QName("http://ws.webservice.com/", "SayHelloImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/cxf_webservice_spring/SayHelloWS?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SayHelloImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/cxf_webservice_spring/SayHelloWS?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SayHelloImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SayHelloImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SayHelloImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SayHelloImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SayHelloImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SayHelloImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns SayHelloWS
     */
    @WebEndpoint(name = "SayHelloImplPort")
    public SayHelloWS getSayHelloImplPort() {
        return super.getPort(SayHelloImplPort, SayHelloWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SayHelloWS
     */
    @WebEndpoint(name = "SayHelloImplPort")
    public SayHelloWS getSayHelloImplPort(WebServiceFeature... features) {
        return super.getPort(SayHelloImplPort, SayHelloWS.class, features);
    }

}