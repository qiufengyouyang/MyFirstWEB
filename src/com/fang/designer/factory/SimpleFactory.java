package com.fang.designer.factory;

/**
 * @author zhangning
 * 2016年7月29日
 * 简单工厂方法一
 * 简单工厂模式适用于业务简单的情况下或者具体产品很少增加的情况
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 */
public class SimpleFactory {
	
	/**
	 * @param type
	 * @return
	 */
	public Sender getSender(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("office".equals(type)){
			return new OfficeSender();
		}else{
			throw new RuntimeException("没有此类型");
		}
	}
}
