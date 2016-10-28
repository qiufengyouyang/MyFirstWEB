package com.fang.designer.composite;

/**
 * @author zhangning
 * 2016年8月1日
 * 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方
 */
public class Tree {
	private TreeNode root;
	public Tree(String name){
		root = new TreeNode(name);
	}
	public static void main(String[] args) {
		Tree tree = new Tree("A");  
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		nodeB.add(nodeC);
		tree.root.add(nodeB); 
		System.out.println("build the tree finished!"); 
	}

}
