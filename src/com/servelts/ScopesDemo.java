package com.servelts;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ScopesDemo
 */
public class ScopesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// scope

		/*
		request.setAttribute("name", "Raj");
		request.getRequestDispatcher("abc.jsp").forward(request, response);
		*/

		// request --> only one servelt.... one page other page..
		
			ServletContext context = getServletContext();
			context.setAttribute("name1","Dhiraj");
			
		  HttpSession session = request.getSession(); 
		  session.setAttribute("name","Parth"); //session invalidate 
		  //session.setMaxInactiveInterval(50);
		  
		  response.sendRedirect("abc.jsp");
		  
		  
		  //session --> till the session ends you can fetch data from session
		  //object..,.. //application
		  
		  
		 

	}

}
