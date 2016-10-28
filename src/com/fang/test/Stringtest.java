package com.fang.test;

public class Stringtest {

	public static void main(String[] args) {
		String a = "adnsd&32&3";
		System.out.println(a.contains("&"));
		a = "abdsbfd";
		System.out.println(a.contains("&"));
		a = "ansds?&dfdf";
		System.out.println(a.contains("?"));
	}

}
