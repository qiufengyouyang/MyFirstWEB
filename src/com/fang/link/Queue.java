package com.fang.link;
//先进先出
//队列数组实现：队列长度有限，但是考虑到平时一般都使用有界队列，这应该也不算是个缺点
public class Queue {
	private Object[] objs;
	private int head;
	private int end;
	private int size;

	public Queue(int size) {
		objs = new Object[size];
		this.head = 0;
		this.end = -1;
		this.size = 0;
	}

	// 末尾追加
	public void push(Object obj) throws Exception {
		if (this.size > objs.length) {
			throw new Exception("queue si full");
		}
		if (end == objs.length - 1) {
			end = -1;
		}
		objs[++end] = obj;
		size++;
	}

	// 取数据
	public Object pop() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue si empty");
		}
		Object temp = objs[head++];
		if (head == objs.length) {
			head = 0;
		}
		size--;
		return temp;
	}

	public Object peek() throws Exception {
		if (this.size == 0)
			throw new Exception("Queue is empty!");
		return objs[head];
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public boolean isFull() {
		return (size == objs.length);
	}

}
