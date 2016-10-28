package com.fang.link;

import java.util.Arrays;

//优点：无长度限制，缺点：入栈慢
/**
 * 由于该栈是由数组实现的，数组的长度是固定的，
 * 当栈空间不足时，必须将原数组数据复制到一个更长的数组中，
 * 考虑到入栈时或许需要进行数组复制，平均需要复制N/2个数据项，
 * 故入栈的时间复杂度为O(N)，出栈的时间复杂度依然为O(1)
 * @author zhangning
 * 2016年10月8日
 */
public class UnboundedStack {
	private int top = -1;
	private Object[] objs;
	public UnboundedStack(int capacity) throws Exception {
		if (capacity < 0 ){
			throw new Exception("不合法的capacity:" + capacity);
		}
		objs = new Object[capacity];
	}
	public UnboundedStack() throws Exception{
		this(10);
	}
	public Object pop() throws Exception{
		if (top == -1){
			throw new Exception("stack is empty");
		}
		return objs[top--];
	}
	public void push(Object obj) throws Exception{
		if (top == objs.length -1) {
			this.enlarge();
		}
		objs[++top] = obj;
	}
	private void enlarge() {
		int num = objs.length /3;
		if (num == 0) {
			num = 1;
		}
		objs = Arrays.copyOf(objs, objs.length + num);
		
	}
	
}
