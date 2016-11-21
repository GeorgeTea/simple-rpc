package com.gl.study.rpc.server;

import com.gl.study.rpc.framework.RpcFramework;
import com.gl.study.rpc.service.IHelloService;
import com.gl.study.rpc.service.impl.HelloService;

public class RpcProvider {

	public static void main(String[] args) throws Exception {
		IHelloService helloService = new HelloService();
		RpcFramework.export(helloService, 1234);
	}

}
