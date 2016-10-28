package com.fang.link;

public class Node {
	protected Node next = null;//指针域
	public Object data;//数据域
	public Node(Object data) {
		this.data = data;
	}
	public void display(){
		System.out.print(data + " ");
	}
}
