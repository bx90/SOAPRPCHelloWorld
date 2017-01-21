package com.bx.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.bx.ws.HelloWorld;

public class HelloWorldClient {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8080/ws/hello?wsdl");

        //1st argument service URI, refer to wsdl document above
		//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.bx.com/", "HelloWorldImplementationService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString("Boxiong"));
	}

}
