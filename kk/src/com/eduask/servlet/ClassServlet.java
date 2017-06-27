package com.eduask.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eduask.biz.ClassBiz;
import com.eduask.biz.impl.ClassBizImpl;

@SuppressWarnings("serial")
public class ClassServlet extends HttpServlet {

	private ClassBiz cb = new ClassBizImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("CLASSLIST", cb.findAllClass());
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
