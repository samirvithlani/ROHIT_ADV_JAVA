package com.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("txtName");
		String age = request.getParameter("txtAge");

		System.out.println("name =" + name);
		System.out.println("age = " + age);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1> name = "+name+"</h1>");
		out.print("<h1> age  ="+age+"</h1>");

	}

}
