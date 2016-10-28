package com.fang.designer.ob;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject  implements Subject {
	private Vector<Observer> observers = new Vector<Observer>();
	@Override
	public void add(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void delete(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> enumo = observers.elements();
		while(enumo.hasMoreElements()){
			enumo.nextElement().update();
		}
	}

	
	public abstract void operate();

}
