package com.fang.link;

//没有长度限制，并且出栈和入栈速度都很快  链表的实现
public class LinkedListStack {

	private LinkList ll = new LinkList();

	public void push(Object obj) {
		ll.addFisrt(obj);
	}

	public Object pop() throws Exception {
		return ll.deleteFirst();
	}

	public void display() {
		ll.display();
	}

	public static void main(String[] args) throws Exception {
		LinkedListStack lls = new LinkedListStack();
		lls.push(1);
		lls.push(2);
		lls.push(3);
		lls.display();
		System.out.println(lls.pop());
		lls.display();
	}
}
