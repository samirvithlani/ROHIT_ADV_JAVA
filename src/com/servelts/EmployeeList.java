package com.servelts;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDao;

/**
 * Servlet implementation class EmployeeList
 */
public class EmployeeList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EmployeeDao employeeDao = new EmployeeDao();
		List<String> employees = employeeDao.employeeList();

		// we need to send this list to employeelist.jsp page...
		request.setAttribute("employeelist", employees);
		request.getRequestDispatcher("emplist.jsp").forward(request, response);
	}

}
