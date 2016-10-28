package com.fang.client;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * @author zhangning
 * 2016年7月29日
 * 将结果集转换成bean对象的处理器
 */
public class BeanHandler implements ResultSetHandler {
	private Class<?> clazz;
	public BeanHandler(Class<?> clazz){
		this.clazz = clazz;
	}
	@Override
	public Object handler(ResultSet rs) {
		try {
			if(!rs.next()){
				return null;
			}
			Object bean = clazz.newInstance();
			//获取元数据
			ResultSetMetaData rsmd =rs.getMetaData();
			int cloumnCount = rsmd.getColumnCount();
			for (int i = 0; i < cloumnCount; i++) {
				String columnName = rsmd.getColumnLabel(i + 1);//获取每列的列名
				Object columnData = rs.getObject(i +1);//获取对应的值
				Field field = clazz.getDeclaredField(columnName);//对应的类的 属性名
				field.setAccessible(true);
				field.set(bean, columnData);
			}
			return bean;
		} catch (Exception e) {
			 throw new RuntimeException(e);
		}
		
	}

}
