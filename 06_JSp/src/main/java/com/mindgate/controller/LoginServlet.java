package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private String id;
	private String pwd;
	private PrintWriter out;
	private RequestDispatcher dispatcher;
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		id=request.getParameter("txtuserid");
//		pwd=request.getParameter("txtpassword");
//		out = response.getWriter();
//		if(id == pwd) {
////			out.println("success");
//			response.sendRedirect("success.jsp");
//		}
//		else {
////			out.println("failed");
//			response.sendRedirect("failure.jsp");
//		}
//	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		id=request.getParameter("txtuserid");
		pwd=request.getParameter("txtpassword");
		out = response.getWriter();
		if(id.equals(pwd)) {
//			out.println("success");
//			response.sendRedirect("success.jsp");
			dispatcher = request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
		}
		else {
//			out.println("failed");
			dispatcher = request.getRequestDispatcher("failure.jsp");
			dispatcher.forward(request, response);
//			response.sendRedirect("failure.jsp");
		}
	}
	}
