package com.fang.exp;

//华佗
//先把图形分成两部分来看待，前四行一个规律，后三行一个规律，
//利用双重   for循环，第一层控制行，第二层控制列。     
public class Shap {
	public static void startG() {
		int i = 0, j = 0;
		for (i = 1; i <= 4; i++) {
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 3; i >= 1; i--) {
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
	//菱形
	public static void lingxin() {
		int i = 0, j = 0;
		for (i = 1; i <= 4; i++) {
			
		}

	}

	public static void main(String[] args) {
		startG();
	}

}
