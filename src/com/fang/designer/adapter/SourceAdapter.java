package com.fang.designer.adapter;

/**
 * @author zhangning
 * 2016年8月1日
 * 
 * 适配器模式(Adapter)
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，
 * 目的是消除由于接口不匹配所造成的类的兼容性问题.
 * 类的适配器模式：
 * 核心思想就是：有一个Source类，拥有一个方法，待适配，
 * 目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 */
public class SourceAdapter extends Source implements Target {

	@Override
	public void say() {
		System.out.println("this is target method..");

	}

}
