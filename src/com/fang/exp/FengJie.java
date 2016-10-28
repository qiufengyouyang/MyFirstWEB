package com.fang.exp;

//分解质因数 。对n进行分解质因数，应先找到一个最小的质数k，然后按照如下的步骤噢
//(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。 
//(2)如果n <> k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你,重复执行第一
//(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。  
public class FengJie {
	// 递归调用
	public static void fenjie(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + "*");
				fenjie(n / i);
			}
		}
		System.out.println(n);

		System.exit(0);//
	}

	// 质因数分解
	public static void getNumber(int number) {
		int a = 2;// 定义最小的质数
		System.out.print(number + "=");
		while (number > a) {//// 在质数小于输入的数时，进行循环
			if (number % a == 0) {// 当输入的数与质数的余数为0时,输出这个质数
				System.out.print(a + "*");
				number = number / a;// 把剩下的结果赋给num
			} else {
				a++;// 在余数不为0时,质数递增
			}
		}

		System.out.print(a);
	}

	public static String getPrice(int score) {
		return score > 90 ? "A" : (score > 60 ? "B" : "C");
	}
	//分解正整数
	public static void my(int num) {
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				System.out.print(i + "*");
				num = num / i;
				i = 2;
			}
		}
		System.out.println(num);
	}

	public static void main(String[] args) {
		// fenjie(90);
		// getNumber(90);
		my(90);
	}

}
