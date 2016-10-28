package com.fang.link;
//栈数组实现一：优点：入栈和出栈速度快，缺点：长度有限(有时候这也不能算是个缺点)
//后进先出
public class Stack {
	private int top = -1;
	private Object[] objs;
	public Stack(int capacity) throws Exception {
		if (capacity < 0 ){
			throw new Exception("不合法的capacity:" + capacity);
		}
		objs = new Object[capacity];
	}
	public void push(Object obj) throws Exception {
		if (top == objs.length -1) {
			throw new Exception("statck is full");
		}
		objs[++top] = obj;
	}
	public Object pop() throws Exception{
		if (top == -1) {
			throw new Exception("statck is empty");
		}
		return objs[top--];
	}
	 public void dispaly(){  
	        System.out.print("bottom -> top: | ");  
	        for(int i = 0 ; i <= top ; i++){  
	            System.out.print(objs[i]+" | ");  
	        }  
	        System.out.print("\n");  
	    }  
	      
	    public static void main(String[] args) throws Exception{  
	        Stack s = new Stack(2);  
	        s.push(1);  
	        s.push(2);  
	        s.dispaly();  
	        System.out.println(s.pop());  
	        s.dispaly();  
	        s.push(99);  
	        s.dispaly();  
	        s.push(99);  
	    }  
}
