package com.fang.designer.builder;

/**
 * @author zhangning
 * 2016年8月1日
 * 从这点看出，建造者模式将很多功能集成到一个类里，这个类可以创造出比较复杂的东西。
 * 所以与工程模式的区别就是：工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部分
 */
public class TestBuilder {

	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(5);

	}

}
