package com.zn.unit;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
//字符串操作工具类
public class StringUtil {
	/**
	 * 字符串分隔符
	 */
	public static final String SEPARATOR = String.valueOf((char) 29);

	// 判断字符串为空
	public static boolean isEmpty(String str) {
		return StringUtils.isEmpty(str);

	}

	// 判断字符串非空
	public static boolean isNotEmpty(String str) {
		return StringUtils.isNotEmpty(str);
	}

	// 字符串为空的时候 赋值默认值
	public static String defaultIfEmpty(String str, String defaultStr) {
		return StringUtils.defaultIfEmpty(str, defaultStr);
	}

	// 替换固定格式的字符串
	public static String replaceAll(String str, String reg, String replacement) {
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(str);
		StringBuffer buffer = new StringBuffer();
		while (matcher.find()) {
			// 将当前匹配子串替换为指定字符串，
			//并且将替换后的子串以及其之前到上次匹配子串之后的字符串段
			// 添加到一个 StringBuffer对象里
			matcher.appendReplacement(buffer, replacement);
		}
		// 则将最后一次匹配工作后剩余的字符串添加到一个 StringBuffer 对象里。
		matcher.appendTail(buffer);
		return buffer.toString();
	}

	// 判断是不是数字
	public static boolean isNumber(String str) {
		return NumberUtils.isNumber(str);
	}

	// 判断是不是十进制
	public static boolean isDigites(String str) {
		return NumberUtils.isDigits(str);
	}

	// 将骆驼风格替换为下划线风格
	public static String camelToUnderline(String str) {
		Matcher matcher = Pattern.compile("[A-Z]").matcher(str);
		StringBuilder builder = new StringBuilder(str);
		for (int i = 0; matcher.find(); i++) {
			builder.replace(matcher.start() + i, 
					matcher.end() + i,
					"_" + matcher.group().toLowerCase());
		}
		if (builder.charAt(0) == '_') {
			builder.deleteCharAt(0);
		}
		return builder.toString();
	}

	// 将下划线风格替换为驼峰风格
	public static String underlineToCamelhump(String str) {
		Matcher matcher = Pattern.compile("_[a-z]").matcher(str);
		StringBuilder builder = new StringBuilder(str);
		for (int i = 0; matcher.find(); i++) {
			builder.replace(matcher.start() - i,
					matcher.end() - i, 
					matcher.group().substring(1).toLowerCase());
		}
		if (Character.isUpperCase(builder.charAt(0))) {
			builder.replace(0, 1, String.valueOf(Character.toLowerCase(builder.charAt(0))));
		}
		return builder.toString();
	}

	// 分割固定格式的字符串
	public static String[] splitString(String str, String seperator) {
		return StringUtils.splitByWholeSeparator(str, seperator);
	}

	// 将字符串首字母大写
	public static String firstToUpper(String str) {
		return Character.toUpperCase(str.charAt(0)) + str.substring(1);
	}

	// 将字符串首字母小写
	public static String firsToLower(String str) {
		return Character.toLowerCase(str.charAt(0)) + str.substring(1);
	}
	// * 转为帕斯卡命名方式（如：FooBar）
	public static String toPascalStyle(String str, String seperator) {
		return firstToUpper(toCamelhumpStyle(str, seperator));
	}
	//转为驼峰命令方式（如：fooBar）
	public static String toCamelhumpStyle(String str,String sperator){
		return underlineToCamelhump(toUnderLineStyle(str, sperator));
	}
	//转为下划线命名方式（如：foo_bar）
	public static String toUnderLineStyle(String str,String sperator){
		str = str.trim().toLowerCase();
		if(str.contains(sperator)){
			str = str.replace(sperator, "_");
		}
		return str;
	}
	//转为显示命名方式（如：Foo Bar）
	public static String toDisplayStyle(String str,String sperator){
		String displayName = "";
		str = str.trim().toLowerCase();
		if(str.contains(sperator)){
			String[] words = StringUtil.splitString(str, sperator);
			for (int i = 0; i < words.length; i++) {
				displayName += StringUtil.firstToUpper(words[i]) + " ";
			}
			displayName =displayName.trim();
		}else{
			displayName = StringUtil.firstToUpper(str);
		}
		return displayName;
	}
	public static void main(String[] args) {

	}

}
