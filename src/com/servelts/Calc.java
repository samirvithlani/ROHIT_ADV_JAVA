package com.servelts;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calc
 */
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>PLS ENTER your CHOICE in console ::</h1>");
		out.print("<h1>PRESS 1 for sum</h1>");
		out.print("<h1>PRESS 2 for sub</h1>");
		out.print("<h1>PRESS 3 for mul</h1>");
		out.print("<h1>PRESS 4 for div</h1>");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice");
		int choice = sc.nextInt();

		int no1 = 100, no2 = 200, no3 = 0;

		switch (choice) {
		case 1:
			no3 = no1 + no2;

			out.print("<font color = 'RED'><h2>SUM = " + no3 + "<h2></font>");
			break;

		case 2:
			no3 = no1 - no2;
			out.print("<h2>SUB = " + no3 + "<h2>");
			break;

		default:
			break;
		}

	}

}
