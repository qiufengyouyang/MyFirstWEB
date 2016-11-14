package com.fang;

public class HelloWorld {
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	public static void helloA() throws InterruptedException{
		System.out.println("hello a");
		Thread.sleep(2000);
		
	}
	public static void helloB(){
		System.out.println("hello B");
	}
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		sysncFunc();
		System.out.println("同步....");
		func();
	}
	public static void sysncFunc() throws InterruptedException{
		helloA();
		helloB();
	}
	public static void func(){
		new Thread(){
			public void run(){
				try {
					helloA();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		new Thread(){
			public void run(){
				
					helloB();
				
			}
		}.start();
	}
}
