package com.servelts;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FetchCookie
 */
public class FetchCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie[] ck = request.getCookies();
		System.out.println(ck);
		if (ck != null) {
			for (Cookie c : ck) {

				System.out.println(c.getName() + "-" + c.getValue() + " - " + c.getMaxAge());
			}
		}

	}
}
