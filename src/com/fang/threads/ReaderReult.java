package com.fang.threads;
//多个线程在等待一个对象锁时候使用notifyAll()
public class ReaderReult extends Thread {
	Calculatror c; 
	ReaderReult(Calculatror c) {
		this.c = c;
	}
	@Override
	public void run() {
			synchronized (c) {
				System.out.println(Thread.currentThread().getName() + "开始计算..");
				
				try {
					c.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "计算结果:" + c.total);
			}
	
	}
	
	public static void main(String[] args) {
		Calculatror c = new Calculatror();
		////启动三个线程，分别获取计算结果 
		new ReaderReult(c).start();
		new ReaderReult(c).start();
		new ReaderReult(c).start();
		////启动计算线程 
		c.run();
	}
	
	
}
