package com.vsky.listener;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
/**
 * 监听ServletContext对象的创建和销毁
 * @date 2018年8月5日下午12:12:53
 * @author maguoying@188.com
 * @Description
 */
public class MyServletContextListener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent sce) {
		Map userMap = new HashMap();
		sce.getServletContext().setAttribute("userMap", userMap);
	}

	public void contextDestroyed(ServletContextEvent sce) {
	}
}