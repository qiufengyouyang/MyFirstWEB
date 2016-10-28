package com.fang.exp;

//水仙花 数  :指一个三位数，其各位数字立方和等于该数本身
public class ShuiXianHua {
	public static boolean isShuiXianHua(int x) {
		int i = 0, j = 0, k = 0;
		i = x / 100;// 百位数
		j = (x % 100) / 10;// 十位数
		k = x % 10;// 个位数
		if (x == i * i * i + j * j * j + k * k * k) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		for (int i = 100; i < 999; i++) {
			if (isShuiXianHua(i)) {
				System.out.println(i);
			}
		}

	}

}
