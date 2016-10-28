package com.fang.test;

public class TestCase {
	public static String whichOne(int i) {
		String result = "";
		switch (i) {
		default:
			result += "0";

		case 3:

			result += "3";
		case 2:
			result += "2";
			break;
		case 1:
			result += "1";
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(whichOne(3));// 32
		System.out.println(whichOne(1));// 1
		System.out.println(whichOne(2));// 2
		System.out.println(whichOne(4));//032
	}

}
