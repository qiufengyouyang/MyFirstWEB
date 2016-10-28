package com.fang.exp;

//一个数如果恰好等于它的因子之和，这个数就称为 "完数 "
public class WanShu {

	public static void main(String[] args) {
		int sum;
		for (int i = 1; i < 1000; i++) {
			sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if(sum == i){
				System.out.print(i + ",");
			}
		}
		System.out.println();

	}

}
