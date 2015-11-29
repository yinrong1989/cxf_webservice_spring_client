
package com.webservice.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webservice.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _YinrongSayHello_QNAME = new QName("http://ws.webservice.com/", "yinrongSayHello");
    private final static QName _SayHello_QNAME = new QName("http://ws.webservice.com/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://ws.webservice.com/", "sayHelloResponse");
    private final static QName _GetStudentById_QNAME = new QName("http://ws.webservice.com/", "getStudentById");
    private final static QName _GetStudentByIdResponse_QNAME = new QName("http://ws.webservice.com/", "getStudentByIdResponse");
    private final static QName _YinrongSayHelloResponse_QNAME = new QName("http://ws.webservice.com/", "yinrongSayHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservice.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link YinrongSayHelloResponse }
     * 
     */
    public YinrongSayHelloResponse createYinrongSayHelloResponse() {
        return new YinrongSayHelloResponse();
    }

    /**
     * Create an instance of {@link GetStudentByIdResponse }
     * 
     */
    public GetStudentByIdResponse createGetStudentByIdResponse() {
        return new GetStudentByIdResponse();
    }

    /**
     * Create an instance of {@link GetStudentById }
     * 
     */
    public GetStudentById createGetStudentById() {
        return new GetStudentById();
    }

    /**
     * Create an instance of {@link YinrongSayHello }
     * 
     */
    public YinrongSayHello createYinrongSayHello() {
        return new YinrongSayHello();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YinrongSayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.webservice.com/", name = "yinrongSayHello")
    public JAXBElement<YinrongSayHello> createYinrongSayHello(YinrongSayHello value) {
        return new JAXBElement<YinrongSayHello>(_YinrongSayHello_QNAME, YinrongSayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.webservice.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.webservice.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.webservice.com/", name = "getStudentById")
    public JAXBElement<GetStudentById> createGetStudentById(GetStudentById value) {
        return new JAXBElement<GetStudentById>(_GetStudentById_QNAME, GetStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.webservice.com/", name = "getStudentByIdResponse")
    public JAXBElement<GetStudentByIdResponse> createGetStudentByIdResponse(GetStudentByIdResponse value) {
        return new JAXBElement<GetStudentByIdResponse>(_GetStudentByIdResponse_QNAME, GetStudentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YinrongSayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.webservice.com/", name = "yinrongSayHelloResponse")
    public JAXBElement<YinrongSayHelloResponse> createYinrongSayHelloResponse(YinrongSayHelloResponse value) {
        return new JAXBElement<YinrongSayHelloResponse>(_YinrongSayHelloResponse_QNAME, YinrongSayHelloResponse.class, null, value);
    }

}
