package com.fang.designer.factory;

/**
 * @author zhangning
 * 2016年7月29日
 * 通过多个方法 的方式  避免写错 'type'
 * 多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，
 * 如果传递的字符串出错，
 * 则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象。
 */
public class SimpleMethodFactory {
	
	public Sender getMailSender(){
		return new MailSender();
	}
	public Sender getOfficeSender(){
		return new OfficeSender();
	}
}
