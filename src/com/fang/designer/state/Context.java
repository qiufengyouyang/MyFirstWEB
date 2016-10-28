package com.fang.designer.state;

public class Context {
	private State state;
	
	public Context(State state) {
		super();
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	public void method(){
		if("state01".equals(state.getValue())){
			state.method1();
		}else if("state02".equals(state.getValue())){
			state.method2();
		}
	}
}
