package com.servelts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductController
 */

public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	static List<Product> products = new ArrayList<Product>();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String pName = request.getParameter("txtProductName");
		int pPrice = Integer.parseInt(request.getParameter("txtProductPrice"));
		int pQty = Integer.parseInt(request.getParameter("txtProductQty"));

		Product p1 = new Product(pName, pPrice, pQty);
		products.add(p1);

		request.setAttribute("products", products);
		request.getRequestDispatcher("./products/ViewProducts.jsp").forward(request, response);

	}

}
