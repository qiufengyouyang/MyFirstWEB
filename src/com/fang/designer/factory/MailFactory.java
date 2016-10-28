package com.fang.designer.factory;

/**
 * @author zhangning
 * 2016年7月29日
 * 工厂方法模式：
 *
 *  又叫虚拟构造器模式或多态工厂，它先一个用于创建对象的接口，
 *  然后让子类决定实例化哪一个类。也就是说工厂方法让一个类的实例化延迟到其子类
 */
public class MailFactory implements SenderFactory {

	@Override
	public Sender procuce() {
		
		return new MailSender();
	}

}
