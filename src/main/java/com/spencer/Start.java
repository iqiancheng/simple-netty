package com.spencer;
import com.spencer.pool.NioSelectorRunnablePool;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
/**
 * 启动函数
  @author spencer

 *
 */
public class Start {

	public static void main(String[] args) {

		
		//初始化线程
		NioSelectorRunnablePool nioSelectorRunnablePool = new NioSelectorRunnablePool(Executors.newCachedThreadPool(), Executors.newCachedThreadPool());
		
		//获取服务类
		ServerBootstrap bootstrap = new ServerBootstrap(nioSelectorRunnablePool);
		
		//绑定端口
		bootstrap.bind(new InetSocketAddress(10101));
		
		System.out.println("start");
	}

}
