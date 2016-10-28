package com.fang.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {
	private static int count = 0;
	public static void testTimer02(){
		//在实现时，Timer类可以调度任务，TimerTask则是通过在run()方法里实现具体任务。
		//当Timer的构造器被调用时，它创建了一个线程，这个线程可以用来调度任务。线程安全的
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){

			@Override
			public void run() {
				System.out.println("hihi");
				
			}
			
		}, 0, 2000);
	}
	public static void main(String[] args) {
		testTimer02();
	}
	public static void testTimer01(){
		TimerTask task = new TimerTask(){

			@Override
			public void run() {
				++ count;
				System.out.println("时间:"+new Date()+",执行了 "+count+"次");
				
			}
			
		};
		//设置执行时间
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		//定制执行 三居
		calendar.set(year, month, day, 9, 11, 01);
		Date date = calendar.getTime();
		Timer timer = new Timer();
		//每天的date时刻执行task, 仅执行一次
		timer.schedule(task, date);
	}
}
