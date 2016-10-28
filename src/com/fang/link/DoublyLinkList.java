package com.fang.link;

//双向链表
//双向链表的节点中有两个指针，其中一个后继节点的指针，另一个指向前一个节点的指针。
//单向链表存储结构的节点中只有一个指向后继节点的指针；
public class DoublyLinkList {

	private class Node {
		private Object data;
		private Node pre = null;
		private Node next = null;

		Node(Object data) {
			this.data = data;
		}
	}

	private Node first = null;
	private Node last = null;

	public void insertFirst(Object data) {
		Node node = new Node(data);
		if (first == null) {
			last = node;
		} else {
			node.next = first;
			first.pre = node;
		}
		first = node;
	}

	public void insertLast(Object data) {
		Node node = new Node(data);
		if (first == null) {
			first = node;
		} else {
			last.next = node;
			node.pre = last;
		}
		last = node;
	}

	// 在之后插入节点
	public boolean insertAfter(Object target, Object obj) {
		Node node = new Node(obj);
		Node cur = first;
		while (cur != null) {
			if (cur.data.equals(target)) {
				node.next = cur.next;
				node.pre = cur;
				if (cur == last) {
					last = node;
				} else {
					cur.next.pre = node;
				}
				cur.next = node;
				return true;
			}
			cur = cur.next;
		}
		return false;
	}

	public Node deleteFirst() throws Exception {
		if (first == null) {
			throw new Exception("链表是空的!");
		}
		Node temp = first;
		if (first.next == null) {
			first = null;
			last = null;
		} else {
			first.next.pre = null;
			first = first.next;
		}
		return temp;

	}

	public Node deleteLast() throws Exception {
		if (first == null) {
			throw new Exception("链表是空的!");
		}
		Node temp = last;
		if (first.next == null) {
			first = null;
			last = null;
		} else {
			last.pre.next = null;
			last = last.pre;
		}
		return temp;
	}

	public Node delete(Object data) {
		Node cur = first;
		while (cur != null) {
			if (cur.data.equals(data)) {
				if (cur == first) {
					first = cur.next;
				} else {
					cur.pre.next = cur.next;
				}
				if (cur == last) {
					last = cur.pre;
				} else {
					cur.next.pre = cur.pre;
				}
				return cur;
			}
			cur = cur.next;
		}
		return null;
	}

	public void display() {
		System.out.print("first -> last : ");
		Node data = first;
		while (data != null) {
			System.out.print(data.data.toString() + " -> ");
			data = data.next;
		}
		System.out.print("\n");
	}
	
	
	 public static void main(String[] args) throws Exception{  
	        DoublyLinkList dll = new DoublyLinkList();  
	        dll.insertFirst(1);  
	        dll.insertLast(3);  
	        dll.insertAfter(1, 2);  
	        dll.insertAfter(3, 4);  
	        dll.insertAfter(4, 5);  
	        dll.display();  
	        dll.deleteFirst();  
	        dll.display();  
	        dll.deleteLast();  
	        dll.display();  
	        dll.delete(3);  
	        dll.display();  
	        dll.delete(2);  
	        dll.display();  
	        dll.delete(4);  
	        dll.display();  
	    }  

}
