package com.zn.unit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//日期工具类
public class DateUtil {
	//格式化 日期+时间
	private static final SimpleDateFormat datetimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	//格式化日期
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	//格式化 时间
	private static final SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

	//格式化日期和时间
	public static String formateDateTime(long timestamp){
		return datetimeFormat.format(new Date(timestamp));
	}
	//格式化日期
	public static String foramatDate(long timestamp){
		return dateFormat.format(new Date(timestamp));
	}
	//格式化时间
	public static String formatTime(long time){
		return timeFormat.format(new Date(time));
	}
	//获取当前日期
	public static String getCurrentDate(){
		return dateFormat.format(new Date());
	}
	//获取当前 日期和时间
	public static String getCurrentDatetime(){
		return datetimeFormat.format(new Date());
	}
	//格式化 时间
	public static String getCurrentTime(){
		return timeFormat.format(new Date());
	}
	//解析时间和日期
	public static Date parseDateTime(String str){
		Date date = null;
		try {
			date=datetimeFormat.parse(str);
		} catch (ParseException e) {
			
			e.printStackTrace();
			throw new RuntimeException("即系日期格式字符创出错,格式为:yyyy-MM-dd HH:mm:ss");
		}
		return date;
	}
	//解析时间
	public static Date parseDate(String str){
		Date date = null;
		try {
			date = dateFormat.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException("格式化日期字符串出错,格式为:yyyy-MM-dd");
		}
		return date;
	}
	//格式化  时间
	public static Date parseTime(String str){
		Date date = null;
		try {
			date=timeFormat.parse(str);
		} catch (ParseException e) {
			
			e.printStackTrace();
			throw new RuntimeException("格式化日期出错,格式为i:HH:mm:ss");
		}
		return date;
	}

}
