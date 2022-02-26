package com.servelts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.ValidationUtil;

/**
 * Servlet implementation class InsertExam
 */
public class InsertExam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String examname = request.getParameter("txtExamName");
		String examVenue = request.getParameter("txtExamVenue");
		boolean flag = false;

		System.out.println(examname);
		if (ValidationUtil.isEmpty(examname)) {
			request.setAttribute("nameerror", "exam name is required...");
			flag = true;
			// request.getRequestDispatcher("InsertExam.jsp").forward(request, response);

		}
		if (ValidationUtil.isEmpty(examVenue)) {

			request.setAttribute("venueerror", "exam vanue is required...");
			flag = true;
			// request.getRequestDispatcher("InsertExam.jsp").forward(request, response);

		}
		if (flag == true) {

			request.getRequestDispatcher("InsertExam.jsp").forward(request, response);
		} else {

			// set data to bean..
		}

	}

}
