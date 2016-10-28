package com.fang.exp;

//两个正整数的最大公约数和最小公倍数
//最大公约数  :利用辗除法
/**
 * 用辗转相除法求几个数的最大公约数，
 * 可以先求出其中任意两个数的最大公约数，
 * 再求这个最大公约数与第三个数的最大公约数，
 * 依次求下去，直到最后一个数为止。
 * 最后所得的那个最大公约数，就是所有这些数的最大公约数。
 * @author zhangning
 * 2016年10月21日
 */
public class CommonDivisor {
	public static int commonDivisor(int m, int n) {
		if(m < 0 || n <0){
			System.out.println("erroe");
			return -1;
		}
		if(n == 0){
			System.out.println("最大公约数:" + m);
			return m;
		}
		return commonDivisor(n, m % n);
	}

	public static void main(String[] args) {
		commonDivisor(16, 4);
		commonDivisor(97,11);
		commonDivisor(4, 16);
	}

}
