package com.fang.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TetsTreeMap {

	public static void main(String[] args) {
		Map<String,String> map = new TreeMap<String,String>();
		map.put("b", "bbb");
		map.put("h", "hhh");
		map.put("a", "aaa");
		map.put("d", "ddd");
		map.put("", "");
		map.put("", "");
		System.out.println(map);
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.set(1, "2");
		System.out.println(list);
	}

}
