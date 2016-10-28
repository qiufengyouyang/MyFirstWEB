package com.fang.threads;

public class ThreadA {

	public static void main(String[] args) {
		ThreadB t = new ThreadB();
		
		t.start();
		
		
		synchronized (t) {
			System.out.println("等待b完成计算....");
			
			try {
				t.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("t计算结果为:" + t.total);
		}

	}

}
