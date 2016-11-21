package com.gl.study.rpc.service.impl;

import com.gl.study.rpc.service.IHelloService;

public class HelloService implements IHelloService {

	@Override
	public String hello(String name) {
		return "Hello, " + name;
	}

}
