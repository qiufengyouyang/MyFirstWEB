/**
 * user
 * 2016年8月2日
 * MyFirstWEB
 */
package com.fang.designer.it;

/**
 * @author zhangning
 * 2016年8月2日
 */
public interface Collection {
	Iterator iterator();
	Object get(int i);//根据索引获取元素
	public int size();//获取袁术个数
}
