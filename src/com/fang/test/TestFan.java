package com.fang.test;

import java.util.ArrayList;
import java.util.List;

import com.fang.entity.Sub;
import com.fang.entity.Sup;

public class TestFan {

	public static void main(String[] args) {
		//可以添加  E 类型以及他的子类型
		List<Sup> supList = new ArrayList<Sup>();
		Sup s1 = new Sup();
		Sub sub1 = new Sub();
		supList.add(sub1);
		supList.add(s1);
		
		List<Sub> subList = new ArrayList<Sub>();
		subList.add(sub1);
		
		//只能新增  Null元素
		List<? extends Sup> supList2 = new ArrayList<Sup>();
		supList2.add(null);
		//supList2.add(sub1);
		
		List<? super Sup> supList3 = new ArrayList<Sup>();
		supList3.add(s1);
		supList3.add(sub1);
		
	}

}
