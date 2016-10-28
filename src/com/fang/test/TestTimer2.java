package com.fang.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestTimer2 {

	public static void main(String[] args) {
		Runnable runnable = new Runnable(){

			@Override
			public void run() {
				System.out.println("hello!");
				
			}};
			ScheduledExecutorService service =
					Executors.newSingleThreadScheduledExecutor();
			 service.scheduleAtFixedRate(runnable, 2, 1, TimeUnit.SECONDS);
			

	}

}
