package com.fang.designer.visibler;

public class MySubject implements Subject {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

	@Override
	public String getSubject() {
		
		return "hi";
	}

}
