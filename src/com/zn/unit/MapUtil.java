package com.zn.unit;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.collections.MapUtils;

//mpaUtil操作工具类
public class MapUtil {
	//判断是否为 非空
	public static boolean isNotEmpty(Map<?,?>map){
		return MapUtils.isNotEmpty(map);
	}
	//判断是否为空
	public static boolean isEmpty(Map<?,?>map){
		return MapUtils.isEmpty(map);
	}
	//转换map
	public static <K,V> Map<V,K> invert(Map<K,V>source){
		Map<V,K> target = null;
		if(isNotEmpty(source)){
			target = new LinkedHashMap<V,K>(source.size());
			for (Map.Entry<K, V> entry : source.entrySet()) {
				target.put(entry.getValue(), entry.getKey());
			}
		}
		return target;
	}
}
