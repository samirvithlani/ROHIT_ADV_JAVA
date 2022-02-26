package com.servelts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDao;

/**
 * Servlet implementation class DeleteEmployeeServlet
 */
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");

		// System.out.println("name = " + name);
		EmployeeDao employeeDao = new EmployeeDao();
		boolean flag = employeeDao.deleteEmployee(name);
		if (flag == true) {

			// it mean record deleted....
			response.sendRedirect("employeelist");
		} else {

			response.sendRedirect("employeelist");
		}
	}

}
