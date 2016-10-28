package com.fang.designer.decorate;

public class TestDecorate {
	public static void main(String[] args) {
		Sourceable source = new Source();
		Decorate decorate = new Decorate(source);
		decorate.method();
	}
}
