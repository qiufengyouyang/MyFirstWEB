package com.fang.timer;

import java.util.TimerTask;

public class TimerTaskTest extends TimerTask {
	private String jobName;
	public TimerTaskTest(String jobName) {
		this.jobName = jobName;
	}
	@Override
	public void run() {
		System.out.println("execute " + jobName);
		
	}
	
	
}
