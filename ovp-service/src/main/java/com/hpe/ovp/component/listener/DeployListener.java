package com.hpe.ovp.component.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;

/**
 * This listener is used to start and stop the FetchThread.
 * The FetchThread is used to fetch information from Appliances
 * and save it to ElasticSearch.
 *
 */
@WebListener
public class DeployListener implements ServletContextListener {

	private FetchThread fetchThread = null;
	private static final Logger logger = Logger.getLogger(DeployListener.class);
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		if((fetchThread == null) || (!fetchThread.isAlive())) {
			fetchThread = new FetchThread();
			fetchThread.start();
			logger.info("FetchThread is started");
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		try {
			fetchThread.interrupt();
		} catch (Exception e) {
			logger.error(e.getLocalizedMessage());
		}

	}
	
	private static class FetchThread extends Thread {
		private static final Logger logger = Logger.getLogger(DeployListener.class);
		private static int INTERVAL_MILLIS = 5 * 1000;
		
		public void run() {
			
			try {
				for(;;) {
					fetchInfo();
					Thread.sleep(INTERVAL_MILLIS);
				}				
			} catch (InterruptedException e) {
				logger.error(e.getLocalizedMessage());
			}
		}
		
		private void fetchInfo() {
			logger.info("Fetching information");
		}
	}

}
