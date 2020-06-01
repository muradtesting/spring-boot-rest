package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-05-26T21:11:39.444+04:00
 * Generated source version: 3.3.6
 *
 */
@WebServiceClient(name = "Calculator",
                  wsdlLocation = "http://www.dneonline.com/calculator.asmx?WSDL",
                  targetNamespace = "http://tempuri.org/")
public class Calculator extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "Calculator");
    public final static QName CalculatorSoap12 = new QName("http://tempuri.org/", "CalculatorSoap12");
    public final static QName CalculatorSoap = new QName("http://tempuri.org/", "CalculatorSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://www.dneonline.com/calculator.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Calculator.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://www.dneonline.com/calculator.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public Calculator(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Calculator(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Calculator() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Calculator(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Calculator(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Calculator(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CalculatorSoap
     */
    @WebEndpoint(name = "CalculatorSoap12")
    public CalculatorSoap getCalculatorSoap12() {
        return super.getPort(CalculatorSoap12, CalculatorSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorSoap
     */
    @WebEndpoint(name = "CalculatorSoap12")
    public CalculatorSoap getCalculatorSoap12(WebServiceFeature... features) {
        return super.getPort(CalculatorSoap12, CalculatorSoap.class, features);
    }


    /**
     *
     * @return
     *     returns CalculatorSoap
     */
    @WebEndpoint(name = "CalculatorSoap")
    public CalculatorSoap getCalculatorSoap() {
        return super.getPort(CalculatorSoap, CalculatorSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorSoap
     */
    @WebEndpoint(name = "CalculatorSoap")
    public CalculatorSoap getCalculatorSoap(WebServiceFeature... features) {
        return super.getPort(CalculatorSoap, CalculatorSoap.class, features);
    }

}
