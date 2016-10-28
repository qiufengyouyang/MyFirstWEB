package com.fang.exp;
//判断一个书是不是素数：
//方法:用一个数分别去除2到sqrt(这个数)，如果能被整除，表明是质数;素数
public class Sushu {
	public static boolean isZhishu(int x){
		for (int i = 2; i < Math.sqrt(2); i++) {
			if(x % i ==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		for (int i = 101; i < 200; i++) {
			if(isZhishu(i)) {
				System.out.println(i);
			}
		}
		//float f = 3.12f;

	}

}
