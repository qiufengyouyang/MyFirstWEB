package com.fang.designer.comm;

/**
 * @author zhangning
 * 2016年8月2日
 * MyCommand是命令，实现了Command接口，持有接收对象
 */
public class MyCommand implements Commond {
	private Reciver reciver;
	
	public MyCommand(Reciver reciver) {
		super();
		this.reciver = reciver;
	}

	@Override
	public void execute() {
		
		reciver.action();
	}

}
