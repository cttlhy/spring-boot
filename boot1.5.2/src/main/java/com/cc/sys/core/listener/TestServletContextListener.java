package com.cc.sys.core.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestServletContextListener implements ServletContextListener  {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContex初始化");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContex销毁");
	}

}
