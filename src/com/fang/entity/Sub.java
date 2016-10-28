package com.fang.entity;

public class Sub extends Sup {
	static{
		System.out.println("Sub static....");
	}
	public Sub() {
		System.out.println("Sub constructor..");
	}
	{
		System.out.println("Sub .dai ma kuai..");
	}

}
