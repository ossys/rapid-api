package com.ossys.ae.logging;

public class AELoggerFactory {
	public static AELogger getLogger(String canonical_name) {
		return new AELogger(canonical_name);
	}
}
