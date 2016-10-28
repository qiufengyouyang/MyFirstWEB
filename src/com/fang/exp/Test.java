package com.fang.exp;

class People {
	String name;

	public People() {
		System.out.print(1);
	}

	public People(String name) {
		System.out.print(2);
		this.name = name;
	}
}

class Child extends People {
	People father;

	public Child(String name) {
		System.out.print(3);
		this.name = name;
		father = new People(name + ":F");
	}

	public Child() {
		System.out.print(4);
	}

}

class Dervied extends Base {

	private String name = "dervied";

	public Dervied() {
		tellName();
		printName();
	}

	public void tellName() {
		System.out.println("Dervied tell name: " + name);
	}

	public void printName() {
		System.out.println("Dervied print name: " + name);
	}

}

class Base {

	private String name = "base";

	public Base() {
		tellName2();
		printName();
	}

	public void tellName2() {
		System.out.println("Base tell name: " + name);
	}

	public void printName() {
		System.out.println("Base print name: " + name);
	}
}

public class Test {
	// 判断是不是闰年
	public static boolean isRunNian(int year) {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {// 判断是不是闰年
			return true;
		}
		return false;
	}

	// 99乘法表
	public static void jiujiu() {
		int i = 0;
		int j = 0;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				System.out.println();
			}
		}
	}

	public static void jiujiu2() {
		int i = 0;
		int j = 0;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= i; j++)
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			System.out.println();
		}

	}

	public static void main(String[] args) {
		//new Child("milk");
		jiujiu2();
	}

}
