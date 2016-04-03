package com.ossys.rapd.logging;

public class RapdLoggerFactory {
	
	public static RapdLogger getLogger(Class<?> cls) {
		return new RapdLogger(cls);
	}
	
}
