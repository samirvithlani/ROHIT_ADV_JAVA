package com.servelts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieDEmo
 */
public class CookieDEmo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie ck = new Cookie("name", "royal");
		ck.setMaxAge(60*60*24*30*12);
		Cookie ck1 = new Cookie("data", "abc");
		response.addCookie(ck);
		response.addCookie(ck1);
	}

}
