package com.fang.designer.builder;

import java.util.ArrayList;
import java.util.List;

import com.fang.designer.factory.MailSender;
import com.fang.designer.factory.OfficeSender;
import com.fang.designer.factory.Sender;

/**
 * @author zhangning
 * 2016年8月1日
 * 建造者模式（Builder）
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，
 * 所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的
 */
public class Builder {
	
	private List<Sender> list = new ArrayList<Sender>();
	public void produceMailSender(int count){
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}
	public void produceSmsSender(int count){
		for (int i = 0; i < count; i++) {
			list.add(new OfficeSender());
		}
	}
}
