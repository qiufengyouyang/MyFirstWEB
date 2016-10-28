/**
 * user
 * 2016年8月1日
 * MyFirstWEB
 */
package com.fang.designer.proto;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author zhangning 2016年8月1日 原型模式（Prototype）
 *         原型模式虽然是创建型的模式，但是与工程模式没有关系，从名字即可看出，
 *         该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象。
 *         本小结会通过对象的复制，进行讲解。在Java中，复制对象是通过clone()实现的，
 */
public class Prototype implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2464342866894572365L;

	/*
	 *
	 * 一个原型类，只需要实现Cloneable接口，覆写clone方法，此处clone方法可以改成任意的名称，
	 * 因为Cloneable接口是个空接口，你可以任意定义实现类的方法名，
	 * 如cloneA或者cloneB，因为此处的重点是super.clone()这句话，
	 * super.clone()调用的是Object的clone()方法，而在Object类中，clone()是native的.
	 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
	 * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。 简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Prototype prototype = (Prototype) super.clone();// /* 浅复制 */
		return prototype;
	}

	// private SerializableObject obj;
	private String str;

	/* 深复制 */
	public Object clonDeep() throws IOException, ClassNotFoundException {
		// 写入当前对象的2进制流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		// 读取2精致流昌盛的对象
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
