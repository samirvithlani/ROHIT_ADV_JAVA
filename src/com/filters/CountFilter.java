package com.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class CountFilter
 */

public class CountFilter implements Filter {

	int count = 0;

	public CountFilter() {

	}

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		chain.doFilter(request, response);

		count++;
		System.out.println("COUNT FILTER CALLED...value of Count  = " + count);

	}

	public void init(FilterConfig fConfig) throws ServletException {

		System.out.println("FILTER INIT METHOD CALLED...");

	}

}
