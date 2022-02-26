package com.listners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class ServerStart
 *
 */
public class ServerStart implements ServletContextListener {

	
	public ServerStart() {
		// TODO Auto-generated constructor stub
	}
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent arg0) {

		System.out.println("server is stareted....");
	}

}
