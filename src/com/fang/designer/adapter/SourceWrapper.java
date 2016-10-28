package com.fang.designer.adapter;

/**
 * @author zhangning 2016年8月1日 对象适配器
 * 对象的适配器模式：
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例
 */
public class SourceWrapper implements Target {
	private Source source;

	public SourceWrapper(Source source) {
		this.source = source;
	}

	@Override
	public void hello() {
		source.hello();

	}

	@Override
	public void say() {
		System.out.println("this is the targetable method!");

	}

}
