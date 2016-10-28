package com.zn.unit;

import java.net.URL;

//类操作工具类
public class ClassUtil {
	// 获取类加载器
	public static ClassLoader getClassLoader() {
		return Thread.currentThread().getContextClassLoader();
	}

	// 获取类路径
	public static String getClassPath() {
		String classPath = "";
		URL resource = getClassLoader().getResource("");
		if (resource != null) {
			classPath = resource.getPath();
		}
		return classPath;
	}

	// 类加载
	public static Class<?> loadClass(String className) {
		return loadClass(className, true);
	}

	// 类加载
	public static Class<?> loadClass(String className, boolean isInitialzed) {
		Class<?> clazz;
		try {
			clazz = Class.forName(className, isInitialzed, getClassLoader());
		} catch (ClassNotFoundException e) {
			// 此处不抛出异常 则提示初始化clazz
			throw new RuntimeException("类加载错误");
		}
		return clazz;
	}

	// 判断是否为int类型
	public static boolean isInt(Class<?> type) {
		return type.equals(int.class) || type.equals(Integer.class);
	}

	// 判断是否为long类型
	public static boolean isLong(Class<?> type) {
		return type.equals(long.class) || type.equals(Long.class);
	}

	// 判断是否为double类型
	public static boolean isDouble(Class<?> type) {
		return type.equals(double.class) || type.equals(Double.class);
	}

	// 判断是否为字符串
	public static boolean isString(Class<?> type) {
		return type.equals(String.class);
	}
}
