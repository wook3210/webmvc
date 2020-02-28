package com.work;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListner implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {

		System.out.println("context init");

		sce.getServletContext().setAttribute("name", "init");

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Destory");

	}

}
