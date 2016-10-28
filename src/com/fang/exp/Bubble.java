package com.fang.exp;

import java.util.Arrays;

/**
 * 冒泡法排序
 * 
 * @author zhangning 2016年10月25日 原理：比较两个相邻的元素，将值大的元素交换至右端。
 * 
 *         思路：依次比较相邻的两个数，将小数放在前面，大数放在后面。 即在第一趟：首先比较第1个和第2个数，将小数放前，大数放后。
 *         然后比较第2个数和第3个数，将小数放前，大数放后，如此继续，直至比较最后两个数， 将小数放前，大数放后。重复第一趟步骤，直至全部排序完成。
 */
public class Bubble {

	public static void main(String[] args) {
		int[] array = { 9, 4, 5, 0, 10, 3, 6, 7 };
		bubble(array);
		/*
		 * int temp; int[] arr = { 6, 3, 8, 9, 1 }; for (int i = 0; i <
		 * arr.length - 1; i++) {// 外层循环控制循环多少趟 N-1 for (int j = 0; j <
		 * arr.length - i - 1; j++) {// 内层循环控制 每趟的排序次数 N-i if (arr[j] > arr[j +
		 * 1]) { temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp; } }
		 * 
		 * } System.out.println("排序之后的数组；");
		 * System.out.println(Arrays.toString(arr));
		 * 
		 */ }

	// 冒泡排序算法
	public static void bubble(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}
		int length = arr.length;
		System.out.println("排序之前:" + Arrays.toString(arr));
		for (int i = 0; i < length - 1; i++) {// 排序 N-1趟
			for (int j = 0; j < length - i - 1; j++) {// 每趟比较的次数
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("排序结果:" + Arrays.toString(arr));

	}
	
	

}
