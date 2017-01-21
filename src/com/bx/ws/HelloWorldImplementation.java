package com.bx.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.bx.ws.HelloWorld")
public class HelloWorldImplementation implements HelloWorld {

	@Override
	public String getHelloWorldAsString(String name) {
		return "I'm in hellow World " + name;
	}

}
