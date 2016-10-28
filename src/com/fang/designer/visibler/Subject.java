package com.fang.designer.visibler;

public interface Subject {
	public void accept(Visitor visitor);
	public String getSubject();
}
