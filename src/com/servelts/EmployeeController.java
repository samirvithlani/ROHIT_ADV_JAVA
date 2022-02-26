package com.servelts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**`
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("txtFirstName");
		String lastName = request.getParameter("txtLastName");
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("pwdPassword");
		int age = Integer.parseInt(request.getParameter("txtAge"));

		System.out.println("-->" + firstName);

		// i dont want print over here......
		// and it is not advi.... to write any html code here
		// so we can replace this kind of scenerio with JSP page...
		// for this we have created employeeList.jsp file....

		/// so we need to redirect from here to employeeList.jsp with Data -->
		request.setAttribute("firstName", firstName);
		request.setAttribute("lastName", lastName);
		request.setAttribute("email", email);
		request.setAttribute("password", password);
		request.setAttribute("age", age);

		request.getRequestDispatcher("employeeList.jsp").forward(request, response);

	}

}
