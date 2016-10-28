package com.fang.designer.ob;

public class MySubject extends AbstractSubject {

	@Override
	public void operate() {
		System.out.println("update self!");  
		notifyObservers();

	}

}
