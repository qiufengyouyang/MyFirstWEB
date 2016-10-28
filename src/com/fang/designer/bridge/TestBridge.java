package com.fang.designer.bridge;

public class TestBridge {

	public static void main(String[] args) {
		Bridge bridge = new MyBridge();
		Sourceable sourceq1 = new SourceSub1();
		bridge.setSource(sourceq1);
		bridge.method();
		
		Sourceable sourceq2 = new SourceSub2();
		bridge.setSource(sourceq2);
		bridge.method();

	}

}
