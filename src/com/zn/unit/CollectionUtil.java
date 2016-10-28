package com.zn.unit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

//集合操作工具类
public class CollectionUtil {
	
	//判断集合是否为  非空
	
	public static boolean isNotEmpty(Collection<?>collection){
		return CollectionUtils.isNotEmpty(collection);
	}
	//判断几个是否为空
	public static boolean isEmpty(Collection<?>collection){
		return CollectionUtils.isEmpty(collection);
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(5);
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("e");
		Collection result = 
		CollectionUtils.select(list, new Predicate(){

			@Override
			public boolean evaluate(Object obj) {
				
				return "a".equals(obj);
			}
			
		});
		System.out.println(result);
	}
	
}
