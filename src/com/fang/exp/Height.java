package com.fang.exp;
//一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在   第10次落地时
public class Height {

	public static void main(String[] args) {
		double s = 0;
		double t =100;
		for (int i = 0; i < 10; i++) {
			s = s + t;
			t = t/2;
		}
		System.out.println(s);//路程
		System.out.println(t);

	}

}
