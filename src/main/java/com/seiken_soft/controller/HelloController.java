package com.seiken_soft.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public HelloController() {
		super();
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/inputHello.jsp");
		rd.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String message = (String) request.getParameter("message");
		request.setAttribute("message", message);
		String url;

		if (message != "") {
			url = "/WEB-INF/view/showHello.jsp";
		} else {
			url = "/WEB-INF/view/inputHello.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);

	}

}