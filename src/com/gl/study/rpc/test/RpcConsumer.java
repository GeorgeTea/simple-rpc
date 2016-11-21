package com.gl.study.rpc.test;

import com.gl.study.rpc.framework.RpcFramework;
import com.gl.study.rpc.service.IHelloService;

public class RpcConsumer {

	public static void main(String[] args) throws Exception {
		IHelloService service = RpcFramework.refer(IHelloService.class, "127.0.0.1", 1234);
		for (int i = 0; i < 10000; i++) {
			String hello = service.hello("World. " + i);
			System.out.println(hello);
		}
	}

}
