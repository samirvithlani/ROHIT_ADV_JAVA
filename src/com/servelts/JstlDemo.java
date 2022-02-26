package com.servelts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JstlDemo
 */
public class JstlDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<String> employees = new ArrayList<String>();
		
		employees.add("Raj");
		employees.add("Parth");
		employees.add("Priya");
		employees.add("Keyur");
		
		
		request.setAttribute("employees", employees);
		request.getRequestDispatcher("jstlemployee.jsp").forward(request, response);
		
		
		
		
		
		
		
	}

}
