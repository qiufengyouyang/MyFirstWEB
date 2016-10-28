package com.fang.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyHttpSessionListener
 *
 */
/**
 * @author zhangning
 * 2016年7月26日
 */
public class MyHttpSessionListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public MyHttpSessionListener() {
        System.out.println("sessionListener 构造器");
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	System.out.println("session创建...");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         System.out.println("session 销毁...");
    }
	
}
