package com.fang.exp;
// 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
public class XuLie {
	//抓取 分子分母变化规律
	public static void main(String[] args) {
		double fz=1;
		double fm =1;
		double temp;
		double sun=0;
		for (int i = 0; i < 20; i++) {
			temp = fm;
			fm = fz;
			fz = temp + fz;
			sun += fz/fm;
		}
		System.out.println(sun);

	}

}
