package com.fang.threads;

public class ThreadB extends Thread{
	int total = 0;
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 50; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				total += i;
			}
			notify();
		}
		
		
	}

}
