package com.fang.designer.visibler;

public class TestVisitor {

	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();
		Subject subject = new MySubject();
		//visitor.visit(subject);
		subject.accept(visitor);
	}

}
