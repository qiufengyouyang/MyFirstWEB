package com.fang.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress locAdd = null;
		InetAddress remAdd = null;
		//locAdd = InetAddress.getLocalHost();
		remAdd = InetAddress.getByName("www.baidu.com");
		//System.out.println("本机IP地址：" + locAdd.getHostAddress()); // 得到本地IP地址
		System.out.println("百度IP地址：" + remAdd.getHostAddress()); // 得到百度IP地址
		
	}

}
