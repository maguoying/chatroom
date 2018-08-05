package com.vsky.utils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @date 2018年8月4日下午2:21:06
 * @author maguoying@188.com
 * @Description
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException,IOException {
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=utf-8");
		
		String methodName = req.getParameter("method");
		if(methodName == null || methodName.isEmpty()) {
			methodName = "execute";
		}
		
		Class c = this.getClass();
		try {
			Method m = c.getMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
			String result = (String) m.invoke(this, req, res);
			
			if(result != null && !result.isEmpty()) {
				req.getRequestDispatcher(result).forward(req, res);
			}
		} catch (InvocationTargetException e) {
			e.getTargetException().printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
