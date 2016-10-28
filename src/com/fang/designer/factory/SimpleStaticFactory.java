package com.fang.designer.factory;

/**
 * @author zhangning
 * 2016年7月29日
 * 静态方法 不必创建工厂对象
 * 将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 * 所以，大多数情况下，我们会选用第三种——静态工厂方法模式。
 * 简单工厂  缺点:
 * 1.新增sender实现类，需要工厂类新增方法。
 * 
 */
public class SimpleStaticFactory {
	public static Sender getMailSender(){
		return new MailSender();
	}
	public static Sender getOfficeSender(){
		return new OfficeSender();
	}
}
