package com.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	
	//
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//println -->PrintStram
		//MIME TYPE....
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>HELLO WORLD....</h1>");
		out.print("</body></html>");
		
	}

}
