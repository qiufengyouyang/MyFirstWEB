package com.zn.unit;

import org.apache.commons.lang.ArrayUtils;
//数组操作工具类
public class ArrayUtil {
	// 数组为空的判断
	public static boolean isEmpty(Object[] arr) {
		return ArrayUtils.isEmpty(arr);
	}

	// 数组非空的判断
	public static boolean isNotEmpty(Object[] arr) {
		return !isEmpty(arr);
	}
	//连接
	public static Object[] connect(Object[] arr1, Object[] arr2) {
		return ArrayUtils.addAll(arr1, arr2);
	}
	//是否包含
	public static boolean contains(Object[] arr, Object obj) {
		return ArrayUtils.contains(arr, obj);
	}
}
