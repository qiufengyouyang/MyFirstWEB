package com.fang.designer.comm;

/**
 * @author zhangning
 * 2016年8月2日
 * Invoker是调用者（司令员）
 */
public class Invoker {
	private Commond commod;
	public Invoker(Commond commod) {
		this.commod = commod;
	}
	public void action(){
		commod.execute();
	}
}
