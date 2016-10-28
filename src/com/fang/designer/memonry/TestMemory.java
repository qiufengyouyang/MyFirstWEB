package com.fang.designer.memonry;

/**
 * @author zhangning
 * 2016年8月8日
 * 主要目的是保存一个对象的某个状态，以便在适当的时候恢复对象，
 * 个人觉得叫备份模式更形象些，通俗的讲下：假设有原始类A，A中有各种属性，

* A可以决定需要备份的属性，备忘录类B是用来存储A的一些内部状态，
* 类C呢，就是一个用来存储备忘录的，且只能存储，不能修改等操作。做个图来分析一下：


 */
public class TestMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Original original = new Original("hello");
		Storage storage = new Storage(original.createMementno());
		System.out.println("初始状态:"+original.getVal());
		original.setVal("hi");
		System.out.println("修改之后的状态:"+original.getVal());
		
		//回复
		original.restoreValue(storage.getMementno());
		System.out.println("回复章台"+original.getVal());
	}

}
