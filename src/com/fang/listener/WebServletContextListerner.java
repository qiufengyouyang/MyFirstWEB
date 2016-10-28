package com.fang.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author zhangning
 * 2016年7月26日
 */
public class WebServletContextListerner implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("web应用卸载载了..");

	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("web应用加载载了..");

	}

}
