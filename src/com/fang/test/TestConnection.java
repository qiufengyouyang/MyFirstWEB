package com.fang.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestConnection {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String o = it.next();
			if("b".equals(o)){
				it.remove();
			}
		}
		System.out.println(list);
		
	}

}
