package com.fang.test;

import com.fang.entity.Sub;
import com.fang.entity.Sup;

/**
 * @author zhangning
 * 2016年8月8日
 * 类的初始化
 */
public class TestConstructor {

	public static void main(String[] args) {
		//Sup sup = new Sup();//执行顺序:静态代码块-->初始化代码块--->构造器代码
		Sup sup1 = new Sub();//1.由最顶层己类开始执行静态代码块2.有最顶层开始执行代码块以及构造器
	}

}
