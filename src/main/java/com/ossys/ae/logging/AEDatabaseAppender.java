package com.ossys.ae.logging;

import ch.qos.logback.core.UnsynchronizedAppenderBase;
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
	}
	
	@Override
	public void stop() {
		//Close database connection here
		//Probably a good place to bulk insert remaining log events from the cache
		System.out.println("+++++>>>>>>>>>> IN DB APPENDER STOP() <<<<<<<<<<<<+++++++++++");
		super.stop();
	}
	
}
