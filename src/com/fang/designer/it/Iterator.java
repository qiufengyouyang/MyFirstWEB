/**
 * user
 * 2016年8月2日
 * MyFirstWEB
 */
package com.fang.designer.it;

/**
 * @author zhangning
 * 2016年8月2日
 * 顾名思义，迭代器模式就是顺序访问聚集中的对象，一般来说，集合中非常常见，如果对集合类比较熟悉的话，理解本模式会十分轻松。
 * 这句话包含两层意思：一是需要遍历的对象，即聚集对象，
 * 二是迭代器对象，用于对聚集对象进行遍历访问
 */
public interface Iterator {
	public Object previous();//前移
	public Object next();//后移
	public boolean hasNext();
	public Object first();//获取第一个
}
