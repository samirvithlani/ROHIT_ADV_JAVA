package com.servelts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ElDemoBean;

/**
 * Servlet implementation class ElanagugdeDemo
 */
public class ElanagugdeDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// we are not sending any bean class object

		ElDemoBean el = new ElDemoBean();
		el.setId(101);
		el.setName("raj");

		String name = "Tejas";
		request.setAttribute("name", name);
		request.setAttribute("el", el);

		request.getRequestDispatcher("elangdemo.jsp").forward(request, response);

	}

}
