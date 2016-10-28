package com.fang.link;

//一个单链表的操作
public class LinkList {
	private Node first;// 定义一个头结点
	private int pos = 0;// 节点位置

	public LinkList() {
		first = null;
	}

	// 判断是否为空
	public boolean empty() {
		return first == null;
	}

	// 获取长度
	public int getSize() {
		int count = 0;
		Node cur = first;
		while (cur != null) {
			cur = cur.next;
			count++;
		}
		return count;
	}

	// 插入头结点:新节点为头结点，原先的头结点为新的头结点的下一个节点
	public void addFisrt(Object data) {
		Node node = new Node(data);
		node.next = first;
		first = node;
	}

	// 删除头结点,删除之后头结点为
	public Object deleteFirst() throws Exception {
		if (empty()) {
			throw new Exception("链表是空的");
		}
		Node result = first;
		first = result.next;
		return result.data;
	}

	// 指定位置添加节点
	public void add(int index, int data) {
		Node cur = first;
		Node pre = first;
		while (pos != index) {
			pre = cur;
			cur = cur.next;
			pos++;
		}
		Node node = new Node(data);
		node.next = cur;
		pre.next = node;
		pos = 0;
	}

	// 删除指定位置节点
	public Node deleteByPos(int index) {
		Node cur = first;
		Node pre = first;
		while (pos != index) {
			pre = cur;
			cur = cur.next;
			pos++;
		}
		if (cur == first) {
			first = first.next;
		} else {
			pre.next = cur.next;
			pos = 0;
		}
		return cur;
	}

	// 根据数据删除
	public Node deleteByData(Object data) {
		Node cur = first;
		Node pre = first;
		while (cur.data != data) {
			if (cur.next == null) {// 否则出现空指针
				return null;
			}
			pre = cur;
			cur = cur.next;
		}
		if (cur == first) {
			first = first.next;
		} else {
			pre.next = cur.next;
		}
		return cur;

	}

	// 展示
	public void display() {
		Node cur = first;
		while (cur != null) {
			cur.display();
			cur = cur.next;
		}
		System.out.println();
	}

	// 根据索引查询
	public Node findByPso(int index) {
		Node cur = first;
		while (pos != index) {
			cur = cur.next;
			pos++;
		}
		pos = 0;
		return cur;
	}

	// 根据值
	public Node findByData(Object data) {
		Node cur = first;
		while (cur.data != data) {
			if (cur.next == null) {
				return null;
			}
			cur = cur.next;
		}
		return cur;
	}

	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.addFisrt(4);
		list.addFisrt(3);
		list.addFisrt(2);
		list.addFisrt(1);
		list.display();
		// list.deleteFirst();
		// list.display();
		// list.deleteByPos(2);
		// list.display();

		Node node = list.findByPso(1);
		node.display();
		// list.display();

		// list.display();
	}

}
