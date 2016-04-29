package com.ossys.rapid.logging;

public class RapidLoggerFactory {
	
	public static RapidLogger getLogger(Class<?> cls) {
		return new RapidLogger(cls);
	}
	
}
