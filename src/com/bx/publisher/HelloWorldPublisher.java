package com.bx.publisher;

import javax.xml.ws.Endpoint;

import com.bx.ws.HelloWorldImplementation;

public class HelloWorldPublisher {

	public static void main(String[] args) {
		   Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImplementation());
	}

}
