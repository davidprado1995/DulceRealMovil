import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

/**
 * Created by EQ on 12/07/2016.
 */
public class dulceReal {

    public dulceReal(){

    }

    public boolean loguearVendedor(String usuarioAdm, String clave) throws IOException, XmlPullParserException {

        SoapObject soap = new SoapObject("http://webservices.com/", "loguearVendedor");
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(soap);

        HttpTransportSE http = new HttpTransportSE("http://192.168.1.37:8080/TrabajoIntegradorWS/dulceReal?WSDL");

        http.call("loguearVendedor", envelope);

        Object result = envelope.getResponse();

        return ((Boolean)result).booleanValue();
    }

    public String conseguirProds() throws IOException, XmlPullParserException {
        SoapObject soap = new SoapObject("http://webservices.com/", "conseguirProds");
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(soap);

        HttpTransportSE http = new HttpTransportSE("http://192.168.1.37:8080/TrabajoIntegradorWS/dulceReal?WSDL");

        http.call("conseguirProds", envelope);

        Object result = envelope.getResponse();

        return (String)result;
    }

    public String cargarALaCola(String pedido) throws IOException, XmlPullParserException {
        SoapObject soap = new SoapObject("http://webservices.com/", "cargarALaCola");
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(soap);

        HttpTransportSE http = new HttpTransportSE("http://192.168.1.37:8080/TrabajoIntegradorWS/dulceReal?WSDL");

        http.call("cargarALaCola", envelope);

        Object result = envelope.getResponse();

        return (String)result;
    }

    public boolean loguearCliente(String usuario, String clave) throws IOException, XmlPullParserException {
        SoapObject soap = new SoapObject("http://webservices.com/", "loguearCliente");
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(soap);

        HttpTransportSE http = new HttpTransportSE("http://192.168.1.37:8080/TrabajoIntegradorWS/dulceReal?WSDL");

        http.call("loguearCliente", envelope);

        Object result = envelope.getResponse();

        return ((Boolean)result).booleanValue();
    }

    public String cargarABaseDeDatos() throws IOException, XmlPullParserException {
        SoapObject soap = new SoapObject("http://webservices.com/", "cargarABaseDeDatos");
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(soap);

        HttpTransportSE http = new HttpTransportSE("http://192.168.1.37:8080/TrabajoIntegradorWS/dulceReal?WSDL");

        http.call("cargarABaseDeDatos", envelope);

        Object result = envelope.getResponse();

        return (String)result;
    }

    public String conseguirPedidos() throws IOException, XmlPullParserException {
        SoapObject soap = new SoapObject("http://webservices.com/", "conseguirPedidos");
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(soap);

        HttpTransportSE http = new HttpTransportSE("http://192.168.1.37:8080/TrabajoIntegradorWS/dulceReal?WSDL");

        http.call("conseguirPedidos", envelope);

        Object result = envelope.getResponse();

        return (String)result;
    }

    public String conseguirVentas(int idpedido) throws IOException, XmlPullParserException {
        SoapObject soap = new SoapObject("http://webservices.com/", "conseguirVentas");
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(soap);

        HttpTransportSE http = new HttpTransportSE("http://192.168.1.37:8080/TrabajoIntegradorWS/dulceReal?WSDL");

        http.call("conseguirVentas", envelope);

        Object result = envelope.getResponse();

        return (String)result;
    }

    public String mostrarPorCliente(String idcliente) throws IOException, XmlPullParserException {
        SoapObject soap = new SoapObject("http://webservices.com/", "mostrarPorCliente");
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(soap);

        HttpTransportSE http = new HttpTransportSE("http://192.168.1.37:8080/TrabajoIntegradorWS/dulceReal?WSDL");

        http.call("mostrarPorCliente", envelope);

        Object result = envelope.getResponse();

        return (String)result;
    }
}
