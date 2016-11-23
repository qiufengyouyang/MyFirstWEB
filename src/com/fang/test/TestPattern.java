package com.fang.test;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.catalina.tribes.util.Arrays;
import org.junit.Test;

// 正则表达式  使用
public class TestPattern {
	// 生成支付验证码
		public static String getPayCode(int length) {
			String sCharLow = "abcdefghijklmnopqrstuvwxyz";
			String sCharUpp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String sNumber = "0123456789";
			String rangestr = sCharLow + sNumber;
			Random rand = new Random();
			String str = "";
			for (int i = 0; i < length; i++) {
				int temp = rand.nextInt(length);
				str = str + rangestr.substring(temp, temp + 1);
			}
			return str;
		}
	@Test
	public void testTt(){
		//System.out.println(getPayCode(6));
		double a = 1.235689;
		double b = 1.235689;
		System.out.println(a==b);
		Double.compare(a, b);
	}
	@Test
	public void testPattern() {
		String str = "rrwerqq84461376qqasfdasdfrrwerqq84461377qqasfdasdaa654645aafrrwerqq84461378qqasfdaa654646aaasdfrrwerqq84461379qqasfdasdfrrwerqq84461376qqasfdasdf";
		Pattern p = Pattern.compile("qq(.*?)qq");
		Matcher m = p.matcher(str);
		ArrayList<String> strs = new ArrayList<String>();
		while (m.find()) {
			strs.add(m.group(1));
		}
		for (String s : strs) {
			System.out.println(s);
		}

	}

	@Test
	public void testReplace() {
		Pattern pattern = Pattern.compile("正则表达式");
		Matcher matcher = pattern.matcher("正则表达式 Hello World,正则表达式 Hello World ");
		StringBuffer sbr = new StringBuffer();
		while (matcher.find()) {
			matcher.appendReplacement(sbr, "Java");
		}
		matcher.appendTail(sbr);
		System.out.println(sbr.toString());
	}

	@Test
	public void testPatt() {
		Pattern p = Pattern.compile("\\w+");
		System.out.println(p.pattern());

		p = Pattern.compile("\\d+");
		String[] str = p.split("我的QQ是:456456我的电话是:0532214我的邮箱是:aaa@aaa.com");
		System.out.println(Arrays.toString(str));
	}

	@Test
	public void testPatterns() {
		// Pattern.matcher(String regex,CharSequence input),它与下面这段代码等价
		// Pattern.compile(regex).matcher(input).matches()

		// matches()对整个字符串进行匹配,只有整个字符串都匹配了才返回true
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("22bb23");
		boolean result = m.matches();// 返回false,因为bb不能被\d+匹配,导致整个字符串匹配未成功.
		System.out.println(result);
		Matcher m2 = p.matcher("2223");
		result = m2.matches();// 返回true,因为\d+匹配到了整个字符串
		System.out.println(result);
	}

	@Test
	public void testLokingat() {
		// lookingAt()对前面的字符串进行匹配,只有匹配到的字符串在最前面才返回true
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("22bb23");
		boolean result = m.lookingAt();// 返回true,因为\d+匹配到了前面的22
		System.out.println(result);
		Matcher m2 = p.matcher("aa2223");
		result = m2.lookingAt();// 返回false,因为\d+不能匹配前面的aa
		System.out.println(result);
	}

	@Test
	public void testFind() {
		// find()对字符串进行匹配,匹配到的字符串可以在任何位置.
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("22bb23");
		boolean result = m.find();// 返回true
		System.out.println(result);
		Matcher m2 = p.matcher("aa2223");
		result = m2.find();// 返回true
		System.out.println(result);
		Matcher m3 = p.matcher("aa2223bb");
		result = m3.find();// 返回true
		System.out.println(result);
		Matcher m4 = p.matcher("aabb");
		result = m4.find();// 返回false
		System.out.println(result);
	}

	@Test
	public void testOther() {
		/**
		 * 当使用matches(),lookingAt(),find()执行匹配操作后,就可以利用以上三个方法得到更详细的信息.
		 * start()返回匹配到的子字符串在字符串中的索引位置. end()返回匹配到的子字符串的最后一个字符在字符串中的索引位置.
		 * group()返回匹配到的子字符串
		 */
		Pattern p=Pattern.compile("\\d+"); 
		Matcher m=p.matcher("aaa2223bb"); 
		System.out.println(m.find());//匹配2223 
		System.out.println(m.start());//返回3 
		System.out.println(m.end());//返回7,返回的是2223后的索引号 
		System.out.println(m.group());//返回2223 
		
		
		Matcher m2=p.matcher("2223bb"); 
		m2.lookingAt();   //匹配2223 
		m2.start();   //返回0,由于lookingAt()只能匹配前面的字符串,所以当使用lookingAt()匹配时,start()方法总是返回0 
		m2.end();   //返回4 
		m2.group();   //返回2223 

		Matcher m3=p.matcher("2223"); //如果Matcher m3=p.matcher("2223bb"); 那么下面的方法出错，因为不匹配返回false
		m3.matches();   //匹配整个字符串 
		m3.start();   //返回0
		m3.end();   //返回3,原因相信大家也清楚了,因为matches()需要匹配所有字符串 
		m3.group();   //返回2223
	}
	/**
	 * start(),end(),group()均有一个重载方法它们是start(int i),end(int i),group(int i)
	 * 专用于分组操作,Mathcer类还有一个groupCount()用于返回有多少组. 
	 */
	@Test
	public void testGroup(){
		Pattern p = Pattern.compile("([a-z]+)(\\d+)");
		Matcher matcher = p.matcher("aaa2233bbb");
		matcher.find();
		System.out.println(matcher.groupCount());//返回2，两个分组
		System.out.println(matcher.start(1));//第一个分组匹配到的字符串在字符串张的索引
		System.out.println(matcher.end(1));
		
		System.out.println(matcher.start(2));
		System.out.println(matcher.end(2));
		
		System.out.println(matcher.group(1));
		System.out.println(matcher.group(2));
		System.out.println(matcher.group(0));
	}
	@Test
	public void testPatmatcher(){
		Pattern p=Pattern.compile("\\d+"); 
		Matcher m=p.matcher("我的QQ是:456456 我的电话是:0532214 我的邮箱是:aaa123@aaa.com"); 
		while(m.find()) { 
			 System.out.println(m.group()); 
		     System.out.print("start:"+m.start()); 
		     System.out.println(" end:"+m.end());  
		} 
		
	}
	@Test
	public void testReplace2(){
		Pattern pattern = Pattern.compile("java");
		Matcher matcher = pattern.matcher("java语言很好,ceshi java,结果还行 java最后");
		StringBuffer builder = new StringBuffer();
		while(matcher.find()){
			//将替换后的子串以及其之前到上次匹配子串之后的字符串段添加到一个StringBuffer对象里
			matcher.appendReplacement(builder, "JAVA");
			System.out.println("builder 内容:" + builder);
		}
		matcher.appendTail(builder);// //将最后一次匹配工作后剩余的字符串添加到一个StringBuffer对象里
		System.out.println("调用m.appendTail(sb)后sb的最终内容是:"+ builder.toString()); 
	}

}
