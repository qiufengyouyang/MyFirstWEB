package com.fang.designer.temp;

/**
 * @author zhangning
 * 2016年8月2日
 * 模板方法模式 (Template Method)
 * 定义了一个操作中的算法的骨架，而将部分步骤的实现在子类中完成。
  *模板方法模式使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * 只有继承关系
 * 代表这些具体逻辑步骤的方法称做基本方法(primitive method)；
 * 而将这些基本方法汇总起来的方法叫做模板方法(template method)
 * 钩子方法可以让子类决定是否对算法的不同点进行挂钩
 */
public abstract class AbstractClass {
	public abstract void method1();
	public abstract void method2();
	public void TemplateMethod(){
		method1();
		method2();
	}
}
