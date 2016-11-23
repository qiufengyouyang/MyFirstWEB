package com.zn.unit;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;
import org.smart4j.framework.util.ObjectUtil;

//对象操作工具类
public class ObejctUtil {

	// 通过反射创建实例对象
	@SuppressWarnings("unchecked")
	public static <T> T newInstance(String className) {
		T instance;
		try {
			Class<?> commandClass = ClassUtil.loadClass(className);
			instance = (T) commandClass.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return instance;
	}

	// 设置成员变量的值
	public static void setField(Object obj, String fileName, String value) {
		try {
			if (PropertyUtils.isWriteable(obj, fileName)) {
				PropertyUtils.setProperty(obj, fileName, value);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 获取成员变量
	 */
	public static Object getFieldValue(Object obj, String fieldName) {
		Object propertyValue = null;
		try {
			if (PropertyUtils.isReadable(obj, fieldName)) {
				propertyValue = PropertyUtils.getProperty(obj, fieldName);
			}
		} catch (Exception e) {

			throw new RuntimeException(e);
		}
		return propertyValue;
	}

	// 复制所有成员变量
	public static void copyField(Object source, Object target) {
		try {
			for (Field field : source.getClass().getDeclaredFields()) {
				if (!Modifier.isStatic(field.getModifiers())) {
					field.setAccessible(true);
					field.set(target, field.get(source));
				}
			}
		} catch (Exception e) {
			
			throw new RuntimeException(e);
		}

	}
	 /**
     * 获取对象的字段映射（字段名 => 字段值），忽略 static 字段
     */
    public static Map<String, Object> getFieldMap(Object obj) {
        return getFieldMap(obj, true);
    }

	private static Map<String, Object> getFieldMap(Object obj, boolean b) {
		Map<String,Object> fieldMap = new HashMap<String,Object>();	
		Field[] fields = obj.getClass().getDeclaredFields();
		for (Field field : fields) {
			if(b && Modifier.isStatic(field.getModifiers())){
				continue;
			}
			String fieldName = field.getName();
			Object value = ObjectUtil.getFieldValue(obj, fieldName);
			fieldMap.put(fieldName, value);
		}
		return fieldMap;
	}
    

}
