package com.zn.unit;
//类型转换工具类
public class CastUtil {
	// 转换为字符串
	public static String castToString(Object obj) {
		return CastUtil.castToString(obj, "");
	}

	public static String castToString(Object obj, String defaultStr) {
		return obj == null ? defaultStr : String.valueOf(obj);
	}

	// 转换为double
	public static double cast2Double(Object obj) {
		return CastUtil.cast2Double(obj, 0);
	}

	public static double cast2Double(Object obj, double defaultVal) {
		double returnVal = defaultVal;
		if (obj != null) {
			String temp = castToString(obj);
			if (StringUtil.isNotEmpty(temp)) {
				try {
					returnVal = Double.parseDouble(temp);
				} catch (NumberFormatException e) {
					returnVal = defaultVal;
				}
			}
		}
		return returnVal;
	}

	// 转换为long
	public static long cast2Long(Object obj) {
		return cast2Long(obj, 0);
	}

	public static long cast2Long(Object obj, long defaultVal) {
		long returnVal = defaultVal;
		if (obj != null) {
			String temp = castToString(obj);
			if (StringUtil.isNotEmpty(temp)) {
				try {
					returnVal = Long.parseLong(temp);
				} catch (NumberFormatException e) {
					returnVal = defaultVal;
				}
			}
		}
		return returnVal;
	}

	// 转换为Int
	public static int cast2Int(Object obj) {
		return cast2Int(obj, 0);
	}

	public static int cast2Int(Object obj, int defaultVal) {
		int result = defaultVal;
		if (obj != null) {
			String temp = castToString(obj);
			if (StringUtil.isNotEmpty(temp)) {
				try {
					result = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					result = defaultVal;
				}
			}
		}
		return result;
	}

	// 转换为Boolean
	public static boolean cast2Boolean(Object obj) {
		return cast2Boolean(obj, false);
	}

	// 转换为Boolean
	public static boolean cast2Boolean(Object obj,boolean defaultVal) {
		boolean result = defaultVal;
		if (obj != null) {
			result = Boolean.parseBoolean(castToString(obj));
		}
		return result;
		
	}
	//将数组转换为字符串数组
	public static String[] cast2StringArray(Object[] arr){
		if (arr == null){
			arr = new Object[0];
		}
		String[] strArray = new String[arr.length];
		if(ArrayUtil.isNotEmpty(arr)){
			for (int i = 0; i < arr.length; i++) {
				strArray[i] = castToString(arr[i]);
			}
		}
		return strArray;
		
	}
	public static double[] cast2DoubleArray(Object[] objArray){
		if(objArray == null){
			objArray = new Object[0];
		}
		double[] doubleArray = new double[objArray.length];
		if(ArrayUtil.isNotEmpty(objArray)){
			for (int i = 0; i < doubleArray.length; i++) {
				doubleArray[i] = cast2Double(objArray[i]);
			}
		}
		return doubleArray;
	}
	public static long[] cast2LongArray(Object[] objArray) {
		if(objArray == null){
			objArray = new Object[0];
		}
		long[] longArray = new long[objArray.length];
		if(ArrayUtil.isNotEmpty(objArray)) {
			for (int i = 0; i < longArray.length; i++) {
				longArray[i] = cast2Long(objArray[i]);
			}
		}
		return longArray;
	}
	public static int[] cast2Int(Object[]objArray){
		if(objArray == null){
			objArray = new Object[0];
		}
		int[] result = new int[objArray.length];
		if(ArrayUtil.isNotEmpty(objArray)){
			for (int i = 0; i < result.length; i++) {
				result[i] = cast2Int(objArray[i]);
			}
		}
		return result;
	}
	public static boolean[] cast2Boolean(Object[]objArray){
		if(objArray == null){
			objArray = new Object[0];
		}
		boolean[] result = new boolean[objArray.length];
		if(ArrayUtil.isNotEmpty(objArray)){
			for (int i = 0; i < result.length; i++) {
				result[i] = cast2Boolean(objArray[i]);
			}
		}
		return result;
	}

}