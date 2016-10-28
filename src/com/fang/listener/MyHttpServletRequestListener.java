package com.fang.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Application Lifecycle Listener implementation class MyHttpServletRequestListener
 *
 */
public class MyHttpServletRequestListener implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public MyHttpServletRequestListener() {
       System.out.println("request构造器");
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent src)  { 
         System.out.println("请求销毁..");
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
         System.out.println("请求创建..");
    }
	
}
