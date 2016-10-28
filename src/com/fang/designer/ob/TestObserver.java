package com.fang.designer.ob;

public class TestObserver {

	public static void main(String[] args) {
		Observer observer1 = new Observer1();
		Observer observer2 = new Observer2();
		Subject subject = new MySubject();
		subject.add(observer2);
		subject.add(observer1);
		subject.operate();
	}

}
