package com.fang.threads;

public class Calculatror extends Thread {
	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 50; i++) {
				total += i;
			}
			notifyAll();
		}
	}
	
	
	
}
