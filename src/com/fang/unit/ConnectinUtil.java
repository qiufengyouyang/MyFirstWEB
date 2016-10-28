package com.fang.unit;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author zhangning
 * 2016年7月22日
 * 测试连接环境的配置
 */
public class ConnectinUtil {
	private static String USERNAME="root";
	private static String PASSWORD="1234";
	private static String URL="jdbc:mysql://localhost:3306/test?useUnicode=true&amp;characterEncoding=utf-8";
	private static String DRIVER_CLASS_NAME="com.mysql.jdbc.Driver";
	public static Connection getConnection() throws Exception{
		Class.forName(DRIVER_CLASS_NAME);
		return DriverManager.getConnection(URL , USERNAME , PASSWORD ) ; 
	}
	

}
