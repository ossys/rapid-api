package com.ossys.ae.logging;

import java.io.OutputStream;

import ch.qos.logback.core.OutputStreamAppender;
import ch.qos.logback.core.encoder.Encoder;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;

//http://www.nurkiewicz.com/2011/04/mongodb-and-recording-appenders-for.html
public class AEConsoleAppender<E> extends OutputStreamAppender<ILoggingEvent> {

	public AEConsoleAppender() {
		super.setOutputStream(System.out);
	}
	
	@Override
	public void start() {
		super.start();
		System.out.println("+++++>>>>>>>>>> IN CONSOLE APPENDER START() <<<<<<<<<<<<+++++++++++");
		//Create database connection here
	}
	
	@Override
	protected void append(ILoggingEvent event) {
		// Insert the event here
		// Probably better to do bulk insert once events reach a certain threshold from the cache
		switch(event.getLevel().levelInt) {
			case Level.ALL_INT:
				System.out.println(event.getMessage());
				break;
			case Level.DEBUG_INT:
				System.out.println(event.getMessage());
				break;
			case Level.ERROR_INT:
				System.out.println(event.getMessage());
				break;
			case Level.INFO_INT:
				System.out.println(event.getMessage());
				break;
			case Level.TRACE_INT:
				System.out.println(event.getMessage());
				break;
			case Level.WARN_INT:
				System.out.println(event.getMessage());
				break;
			case Level.OFF_INT:
				System.out.println(event.getMessage());
				break;
		}
	}
	
	@Override
	public void stop() {
		//Close database connection here
		//Probably a good place to bulk insert remaining log events from the cache
		System.out.println("+++++>>>>>>>>>> IN CONSOLE APPENDER STOP() <<<<<<<<<<<<+++++++++++");
		super.stop();
	}
	
	@Override
	public void setOutputStream(OutputStream outputStream) {
		super.setOutputStream(outputStream);
	}
	
	@Override
	public void setEncoder(Encoder<ILoggingEvent> encoder) {
		super.setEncoder(encoder);
	}
	
}
