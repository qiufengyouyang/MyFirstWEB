package com.fang.designer.state;

/**
 * @author zhangning
 * 2016年8月8日
 * 状态模式就两点：1、可以通过改变状态来获得不同的行为。
 * 2、你的好友能同时看到你的变化
 */
public class TestState {

	public static void main(String[] args) {
		State state = new State();
		Context context = new Context(state);
		
		state.setValue("state01");
		context.method();
		
		state.setValue("state02");
		context.method();
		state.setValue("state03");
		context.method();
		
	}

}
