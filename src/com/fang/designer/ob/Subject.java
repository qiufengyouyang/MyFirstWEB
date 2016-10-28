package com.fang.designer.ob;

/**
 * @author zhangning
 * 2016年8月2日
 * 主体
 */
public interface Subject {
	
	/**
	 * @param 新增观察者
	 */
	void add(Observer observer);
	//删除观察者
	void delete(Observer observer);
	//通知观察者
	public void notifyObservers();
	//操作
	public void operate();
	
}
