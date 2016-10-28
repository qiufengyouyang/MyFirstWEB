package com.fang.local;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;

/**
 * @author zhangning 2016年7月29日 国际化
 */
public class LocalTets {

	@Test
	public void testLocal() {
		Locale locale = Locale.CHINA;
		System.out.println("language: " + locale.getLanguage() + " toString: " + locale.toString() + " country: "
				+ locale.getCountry() + " variant: " + locale.getVariant());
	}

	@Test
	public void testDateFormat() {
		DateFormat format = DateFormat.getInstance();
		Date date = new Date();
		String dateStr = format.format(date);
		System.out.println(dateStr);
		format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		dateStr = format.format(date);
		System.out.println(dateStr);
		//LinkedList;
	}

	@Test
	public void testNumberFormat() {
		Double myNumber = 23323.3323232323;
		//Double test = 0.3434;
		// 返回当前缺省语言环境的缺省数值格式。
		String myString = NumberFormat.getInstance().format(myNumber);
		System.out.println(myString);
		// getCurrencyInstance()返回当前缺省语言环境的通用格式
		myString = NumberFormat.getCurrencyInstance().format(myNumber);
		System.out.println(myString);
		// getNumberInstance() 返回当前缺省语言环境的通用数值格式。
		myString = NumberFormat.getNumberInstance().format(myNumber);
		System.out.println(myString);
	}

	@Test
	public void testMessageFormate() {
		String pig = "{0}{1}{2}{3}{4}{5}{6}{7}{8}{9}{10}{11}{12}{13}{14}{15}{16}";

		Object[] array = new Object[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
				"Q" };

		String value = MessageFormat.format(pig, array);

		System.out.println(value);
		String message = "oh, {0} is 'a' pig";

		array = new Object[] { "ZhangSan" };

		value = MessageFormat.format(message, array);

		System.out.println(value);
	}

}
