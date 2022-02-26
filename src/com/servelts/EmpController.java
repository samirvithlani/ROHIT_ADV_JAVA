package com.servelts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDao;

/**
 * Servlet implementation class EmpController
 */
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String empName = request.getParameter("txtEmpName");
		EmployeeDao employeeDao = new EmployeeDao();

		boolean flag = employeeDao.addEmployee(empName);
		
		if (flag == true) {

			// we need to redirect to suceess.jsp..
			response.sendRedirect("success.jsp");
		} else {

			//HTTP STATUS CODE
			response.sendError(500);
		}

	}

}
