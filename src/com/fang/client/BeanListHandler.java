package com.fang.client;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangning
 * 2016年7月29日
 * 将结果集转换成bean对象的list集合的处理器
 */
public class BeanListHandler implements ResultSetHandler {
	private Class<?> clazz;
	public BeanListHandler(Class<?> clazz) {
		this.clazz = clazz;
	}
	@Override
	public Object handler(ResultSet rs) {
		try {
			List<Object> result = new ArrayList<Object>();
			while(rs.next()){
				Object bean = clazz.newInstance();
				ResultSetMetaData metadata = rs.getMetaData();
				int count = metadata.getColumnCount();
				for (int i = 0; i < count; i++) {
					String columnName = metadata.getColumnName(i+1);
					Object columnData = rs.getObject(i+1);
					
					Field field = clazz.getDeclaredField(columnName);
					field.setAccessible(true);
					field.set(bean, columnData);
				}
				result.add(bean);
			}
			return result;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
