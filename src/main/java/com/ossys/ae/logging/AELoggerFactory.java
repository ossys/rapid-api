package com.ossys.ae.logging;

public class AELoggerFactory {
	
	public static AELogger getLogger(Class<?> cls) {
		return new AELogger(cls);
	}
	
}
