package com.fang.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang.time.DateUtils;

import com.fang.payment.EncryptMethod.PaymentEncryptTool;

public class Hello {
	public static void hello(){
		throw new RuntimeException("ceshi");
	}
	public static void main(String[] args) {
		try {
			hello();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
