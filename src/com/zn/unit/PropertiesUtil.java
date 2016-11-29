package com.zn.unit;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

//属性文件操作工具类
public class PropertiesUtil {

	// 加载属性文件
	public static Properties loadProperties(String filePath) {
		Properties properties = new Properties();
		InputStream in = null;
		try {
			if (StringUtil.isEmpty(filePath)) {
				throw new IllegalArgumentException("参数不合法");
			}
			String suffix = ".properties";
			if (filePath.lastIndexOf(suffix) == -1) {
				filePath += suffix;
			}
			in = ClassUtil.getClassLoader().getResourceAsStream(filePath);
			if (in != null) {
				properties.load(in);
			}
		} catch (IOException e) {
			throw new RuntimeException("属性文件加载出错");
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		return properties;

	}

	// 加在属性文件 转换为map
	public static Map<String, String> loadProperties2Map(String filePath) {
		Map<String, String> result = new HashMap<String, String>();
		Properties p = loadProperties(filePath);
		for (String key : p.stringPropertyNames()) {
			result.put(key, p.getProperty(key));
		}
		return result;

	}

	// 获取字符型的属性
	public static String getString(Properties properties, String key) {
		return getString(properties, key, "");
	}

	// 默认值的方式
	private static String getString(Properties properties, String key, String defaultVal) {
		String value = defaultVal;
		if (properties.containsKey(key)) {
			value = properties.getProperty(key);
		}
		return value;

	}

	// 获取数值型
	public static int getNumber(Properties properties, String key) {
		return getNumber(properties, key, 0);
	}

	// 获取数字型 带有默认值
	private static int getNumber(Properties properties, String key, int defaultValue) {
		int result = defaultValue;
		if (properties.containsKey(key)) {
			result = CastUtil.cast2Int(properties.getProperty(key));
		}
		return result;
	}

	// 获取布尔值类型的数据
	public static boolean getBoolean(Properties properties, String key) {
		return getBoolean(properties, key, false);
	}

	// 获取布尔型的数字 带有默认值
	private static boolean getBoolean(Properties properties, String key, boolean defaultvalue) {
		boolean result = defaultvalue;
		if (properties.containsKey(properties)) {
			result = CastUtil.cast2Boolean(properties.getProperty(key));
		}
		return result;
	}

	// 获取指定前缀的 相关属性
	public static Map<String, Object> getMap(Properties props, String prefix) {
		Map<String, Object> kvMap = new LinkedHashMap<String, Object>();
		Set<String> keySet = props.stringPropertyNames();
		if (CollectionUtil.isNotEmpty(keySet)) {
			for (String key : keySet) {
				if (key.startsWith(prefix)) {
					kvMap.put(key, props.getProperty(key));
				}
			}
		}
		return kvMap;

	}

}
