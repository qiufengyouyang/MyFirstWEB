package com.zn.unit;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.tomcat.util.codec.binary.Base64;

//加密解密工具类
public class CodeUtil {

	// 将url编码

	public static String encodeURL(String str) {
		String target;
		try {
			target = URLEncoder.encode(str, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("编码出错");
		}
		return target;
	}

	// url解码
	public static String decodeUrl(String str) {
		String target;

		try {
			target = URLDecoder.decode(str, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("解码出错!");
		}
		return target;
	}
	//将字符串base64编码
	public static String encodeBase64URLSafeString(String str){
		String target;
		
		try {
			target = Base64.encodeBase64URLSafeString(str.getBytes("utf-8"));
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
			throw new RuntimeException("编码出错");
		}
		return target;
	}
	//字符串base64解码
	public static String decodeBase64(String str){
		String target;
		try {
			target = new String(Base64.decodeBase64(str),"utf-8");
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
			throw new RuntimeException("解码出错!");
		}
		return target;
	}
	
	//字符串md5加密
	public static String encryptMD5(String str){
		return DigestUtils.md5Hex(str);
	}
	//将字符串SHA加密
	public static String encryptSHA(String str){
		return DigestUtils.sha1Hex(str);
	}
	//创建随机数
	public static String createRandom(int count){
		return RandomStringUtils.randomNumeric(count);
	}
	//穿件uuir
	public static String createUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	public static void main(String[] args) {
		System.out.println(encryptMD5("123dfd"));
		System.out.println(DigestUtils.md2Hex("123dfd"));
	}
	
	
	
}
