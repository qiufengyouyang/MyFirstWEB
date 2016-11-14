package com.fang.exp;

import java.util.Arrays;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;

/**
 * 冒泡法排序
 * 
 * @author zhangning 2016年10月25日 原理：比较两个相邻的元素，将值大的元素交换至右端。
 * 
 *         思路：依次比较相邻的两个数，将小数放在前面，大数放在后面。 
 *         即在第一趟：首先比较第1个和第2个数，将小数放前，大数放后。
 *         然后比较第2个数和第3个数，将小数放前，大数放后，如此继续，
 *         直至比较最后两个数， 将小数放前，大数放后。
 *         重复第一趟步骤，直至全部排序完成。
 */
public class Bubble {

	public static void main(String[] args) {
		int[] array = { 9, 4, 5, 0, 10, 3, 6, 7 };
		// bubble(array);
		//selectSort(array);
		//insertSort(array);
		///System.out.println(Arrays.toString(array));
		//System.out.println(RandomUtils.nextInt());
		System.out.println(RandomStringUtils.randomNumeric(6));
		// quickSort(array, 0, array.length - 1);
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
				if (arr[j] > arr[j + 1]) {// 交换位置
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		// System.out.println("排序结果:" + Arrays.toString(arr));

	}

	// 快速排序算法:将一个序列分为两个子序列
	/**
	 * 1.重数列中选出一个元素，成为基准 2.重新排列数列，所有比基准小的摆在基准前面，所有比基准打的摆在基准后面，
	 * 相同的数可以在任意一遍。在这个风格之后，该基准是他的最后位置。这个成为风格操作。 递归的吧小于基准值元素的指数列，和大于基准值元素的指数列排序.
	 * 
	 * 快速排序和归并排序都使用分治法来设计算法，区别在于归并排序把数组分为两个基本等长的子数组， 分别排好序之后还要进行归并(Merge)操作，
	 * 而快速排序拆分子数组的时候显得更有艺术，取一个基准元素， 拆分之后基准元素左边的元素都比基准元素小，右边的元素都不小于基准元素，
	 * 这样只需要分别对两个子数组排序即可，不再像归并排序一样需要归并操作。 基准元素的选取对算法的效率影响很大，最好的情况是两个子数组大小基本相当。
	 * 
	 * @param arr
	 */
	public static void quickSort(int[] numbers, int start, int end) {
		if (start < end) {
			int base = numbers[start];// 选定的基准值(第一个数字作为基准值)
			int i = start, j = end;
			int temp;// 记录临时中间变量
			do {
				while (numbers[i] < base && (i < end)) {
					i++;
				}
				while (numbers[j] > base && (j > start)) {
					j--;
				}
				if (i <= j) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
					i++;
					j--;
				}

			} while (i <= j);
			if (start < j) {
				quickSort(numbers, start, j);
			}
			if (end > i) {
				quickSort(numbers, i, end);
			}
		}

	}

	/**
	 * /** 选择排序<br/>
	 * <li>在未排序序列中找到最小元素，存放到排序序列的起始位置</li>
	 * <li>再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。</li>
	 * <li>以此类推，直到所有元素均排序完毕。</li>
	 * 
	 * @param numbers
	 */
	public static void selectSort(int[] numbers) {
		int size = numbers.length;
		int temp;
		for (int i = 0; i < size; i++) {
			int k = i;
			for (int j = size - 1; j > i; j--) {
				if (numbers[j] < numbers[k]) {
					k = j;
				}
			}
			temp = numbers[i];
			numbers[i] = numbers[k];
			numbers[k] = temp;
		}
	}
	
	/**
	 * 插入排序<br/>
	 * <ul>
	 * <li>从第一个元素开始，该元素可以认为已经被排序</li>
	 * <li>取出下一个元素，在已经排序的元素序列中从后向前扫描</li>
	 * <li>如果该元素（已排序）大于新元素，将该元素移到下一位置</li>
	 * <li>重复步骤3，直到找到已排序的元素小于或者等于新元素的位置</li>
	 * <li>将新元素插入到该位置中</li>
	 * <li>重复步骤2</li>
	 * </ul>
	 * 
	 * @param numbers
	 */  
	public static void insertSort(int[]numbers){
		int size = numbers.length;
		int temp,j;
		for (int i = 1; i <size; i++) {
			temp = numbers[i];
			for (j = i;j > 0 &&temp < numbers[j-1]; j--) {
				numbers[j] = numbers[j-1];
			}
			numbers[j] = temp;
		}
	}

}
