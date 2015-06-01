package com.ossys.ae.logging;

import ch.qos.logback.core.UnsynchronizedAppenderBase;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;

//http://www.nurkiewicz.com/2011/04/mongodb-and-recording-appenders-for.html
public class AEDatabaseAppender<E> extends UnsynchronizedAppenderBase<ILoggingEvent> {

	@Override
	public void start() {
		super.start();
		System.out.println("+++++>>>>>>>>>> IN DB APPENDER START() <<<<<<<<<<<<+++++++++++");
		//Create database connection here
	}
	
	@Override
	protected void append(ILoggingEvent event) {
		// Insert the event here
		// Probably better to do bulk insert once events reach a certain threshold from the cache
		// Insert the event here
		// Probably better to do bulk insert once events reach a certain threshold from the cache
		switch(event.getLevel().levelInt) {
			case Level.ALL_INT:
				System.out.println("ALL (DB):\t" + event.getMessage());
				break;
			case Level.DEBUG_INT:
				System.out.println("DEBUG (DB):\t" + event.getMessage());
				break;
			case Level.ERROR_INT:
				System.out.println("ERROR (DB):\t" + event.getMessage());
				break;
			case Level.INFO_INT:
				System.out.println("INFO (DB):\t" + event.getMessage());
				break;
			case Level.TRACE_INT:
				System.out.println("TRACE (DB):\t" + event.getMessage());
				break;
			case Level.WARN_INT:
				System.out.println("WARN (DB):\t" + event.getMessage());
				break;
			case Level.OFF_INT:
				System.out.println("OFF (DB):\t" + event.getMessage());
				break;
		}
	}
	
	@Override
	public void stop() {
		//Close database connection here
		//Probably a good place to bulk insert remaining log events from the cache
		System.out.println("+++++>>>>>>>>>> IN DB APPENDER STOP() <<<<<<<<<<<<+++++++++++");
		super.stop();
	}
	
}
