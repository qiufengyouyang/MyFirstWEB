package com.fang.lll;
//单向链表
public class LinkList {
	//节点
	class Node{
		Node next = null;//指针域
		Object obj;//数据域
		Node(Object obj){
			this.obj = obj;
		}
		public void display(){
			System.out.println(obj);
		}
	}
	
	
	private Node first;//头节点
	private int pos = 0;//节点位置
	public LinkList() {
        this.first = null;
    }
	//添加头结点
	public Node addFirst(int data){
		Node node = new Node(data);
		node.next = first;
		first = node;
		return node;
	}
	//删除头结点
	public Object delteFirstNode(){
		if(first == null){
			throw new RuntimeException("没哟");
		}
		Node result = first;
		first = result.next;
		return result.obj;
	}
	//查找
	public Object find(Object obj) throws Exception{
		if(first == null){
			throw new Exception("链表是空的");
		}
		Node cur = first;
		while(cur != null){
			if(cur.obj.equals(obj)){
				return cur.obj;
			}
			cur = cur.next;
		}
		return null;
	}
	
	//在任意位置插入
	public void add(int index,int data){
		Node node = new Node(data);
		//维护 插入位置的前一个Node以及新增node与插入位置node的关系
		Node cur = first;
		Node pre = first;
		while(pos != index){
			pre = cur;
			cur = cur.next;
			pos ++;
		}
		node.next = cur;
		pre.next = node;
		pos = 0;
	}
	//删除指定位置的node
	public Node delteNode(int index){
		Node cur = first;
		Node pre = first;
		while(pos != index){
			pre = cur;
			cur = cur.next;
			pos ++;
		}
		if(cur == first){
			first = first.next;
		}else{
			pos = 0;
			pre.next = cur.next;
		}
		return cur;
		
	}
	public void display(){
		if(first == null){
			System.out.println("empty");
		}
		Node cur = first;
		while(cur != null){
			System.out.println(cur.obj.toString() + "->");
			cur = cur.next ;
		}
	}
	
	
}
