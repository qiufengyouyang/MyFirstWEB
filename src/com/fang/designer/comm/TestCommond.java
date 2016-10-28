package com.fang.designer.comm;
public class TestCommond {

	public static void main(String[] args) {
		Reciver receiver = new Reciver();  
		Commond cmd = new MyCommand(receiver); 
		Invoker invoker = new Invoker(cmd);  
		invoker.action();
	}

}
