package com.fang.test;

import java.text.DecimalFormat;
import java.util.Arrays;

public class TestTableName {
	static int size = 1000000;
	private static String getTableNames(String tableName, int maxNewId) {
		String result = "";
		int mode = (maxNewId - 1) / size;
		DecimalFormat nf = new DecimalFormat("_0000000000");
		while (mode >= 0) {
			int baseId = ((maxNewId-1) / size) * size;
			int startId = baseId + 1;
			int endId = baseId + size;
			maxNewId = maxNewId - size;
			result += tableName + nf.format(startId) + nf.format(endId) + ",";
			mode --;
		}

		return result;
	}
	public static void main(String[] args) {
		System.out.println(getTableNames("pay", 2000002));
		System.out.println("..............");
		System.out.println(Arrays.toString(getTableNames("pay", 2000002).split(",")));
	}

}
