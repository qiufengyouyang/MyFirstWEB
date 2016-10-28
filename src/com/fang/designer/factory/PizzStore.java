package com.fang.designer.factory;
//工厂方法
public abstract class PizzStore {
	public Pizz orderPizz(String type) {
		Pizz pizz = createPizz(type);
		pizz.back();
		return pizz;

	}

	abstract Pizz createPizz(String type);
}
