package com.fang.link;

//双端链表
//与单向链表的不同之处在保存有对最后一个链接点的引用(last)
public class DoubleLinkList {
	private class Node {
		private Object data;
		private Node next = null;

		Node(Object data) {
			this.data = data;
		}
	}

	private Node first = null;
	private Node last = null;

	// 是否为空
	public boolean isEmpty() {
		return first == null;
	}

	// 当链结点为空(isEmpty())的时候,这会追加的链结点既是首链结点又是尾链结.所以需要将last指向它.
	public void insertFirst(Object data) {
		Node node = new Node(data);
		if (isEmpty()) {
			last = node;
		}
		node.next = first;
		first = node;

	}

	// 插入尾部链结点也是与普通的理解基本一致,所以不多赘述.唯一也要注意的是链结点为空(isEmpty())的时候.需要将first指向该链结点.
	public void insertLast(Object obj) {
		Node node = new Node(obj);
		if (isEmpty()) {
			first = node;
		} else {
			last.next = node;
		}
		last = node;

	}

	// 这个需要注意的就是,如果仅剩下一个链结点.那么删除后last就应该指向null了.
	public Object deleteFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("empty");
		}
		if (first.next == null) {
			last = null;
		}
		Node temp = first;
		first = first.next;
		return temp.data;
	}

	//
	public void deleteLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("is empty");
		}
		if (first.next == null) {
			last = null;
			first = null;
		} else {
			Node temp = first;
			while (temp.next != null) {
				if (temp.next == last) {
					last = temp;
					last.next = null;
					break;
				}
				temp = temp.next;
			}
		}
	}

	public void display() {
		if (isEmpty())
			System.out.println("empty");
		Node cur = first;
		while (cur != null) {
			System.out.print(cur.data.toString() + " -> ");
			cur = cur.next;
		}
		System.out.print("\n");
	}

	public static void main(String[] args) throws Exception {
		DoubleLinkList fll = new DoubleLinkList();
		fll.insertFirst(2);
		fll.insertFirst(1);
		fll.display();
		fll.insertLast(3);
		fll.display();
		fll.deleteFirst();
		fll.display();
		fll.deleteLast();
		fll.display();
	}

}
