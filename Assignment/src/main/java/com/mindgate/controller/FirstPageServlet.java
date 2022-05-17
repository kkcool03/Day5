package com.mindgate.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstPageServlet")
public class FirstPageServlet extends HttpServlet {
	private String name;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		name = request.getParameter("txtname");
		RequestDispatcher dispatcher = request.getRequestDispatcher("pagetwo.html");
		dispatcher.forward(request, response);
		
	}

}
