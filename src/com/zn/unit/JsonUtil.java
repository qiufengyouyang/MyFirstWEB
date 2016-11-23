package com.zn.unit;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {

	private static final ObjectMapper mapper = new ObjectMapper();

	// 将java对象转换成JSON字符串
	public static <T> String toJSON(T obj) {
		String jsonStr;

		try {
			jsonStr = mapper.writeValueAsString(obj);

		} catch (Exception e) {

			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return jsonStr;

	}
	//将json字符串转换为java对象
	public static <T> T jsonToObject(String json, Class<T> type) {
		T obj;

		try {
			obj= mapper.readValue(json, type);

		} catch (IOException e) {
			
			e.printStackTrace();
			 throw new RuntimeException(e);
		}
		return obj;
	}
}
