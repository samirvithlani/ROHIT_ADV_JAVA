package com.listners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Application Lifecycle Listener implementation class RequestLisner
 *
 */
public class RequestLisner implements ServletRequestListener {

	public void requestDestroyed(ServletRequestEvent req) {

	}

	public void requestInitialized(ServletRequestEvent req) {

		System.out.println("request....");
	}

}
