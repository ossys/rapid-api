package com.ossys.ae.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

public class AELogger implements AELoggerInterface {
	String canonical_name = "";
	Logger logger = null;
	
	boolean info_enabled = false;
	boolean debug_enabled = false;
	boolean warn_enabled = false;
	boolean error_enabled = false;
	
	public AELogger(String canonical_name) {
		this.canonical_name = canonical_name;
		this.logger = LoggerFactory.getLogger(this.canonical_name);
	}
	
	public void enableInfo() {
		this.info_enabled = true;
	}
	
	public void enableDebug() {
		this.debug_enabled = true;
	}
	
	public void enableWarn() {
		this.warn_enabled = true;
	}
	
	public void enableError() {
		this.error_enabled = true;
	}

	@Override
	public void debug(String arg0) {
		logger.debug(arg0);
	}

	@Override
	public void debug(String arg0, Object arg1) {
		logger.debug(arg0, arg1);
	}

	@Override
	public void debug(String arg0, Object... arg1) {
		logger.debug(arg0, arg1);
	}

	@Override
	public void debug(String arg0, Throwable arg1) {
		logger.debug(arg0, arg1);
	}

	@Override
	public void debug(Marker arg0, String arg1) {
		logger.debug(arg0, arg1);
	}

	@Override
	public void debug(String arg0, Object arg1, Object arg2) {
		logger.debug(arg0, arg1, arg2);
	}

	@Override
	public void debug(Marker arg0, String arg1, Object arg2) {
		logger.debug(arg0, arg1, arg2);
	}

	@Override
	public void debug(Marker arg0, String arg1, Object... arg2) {
		logger.debug(arg0, arg1, arg2);
	}

	@Override
	public void debug(Marker arg0, String arg1, Throwable arg2) {
		logger.debug(arg0, arg1, arg2);
	}

	@Override
	public void debug(Marker arg0, String arg1, Object arg2, Object arg3) {
		logger.debug(arg0, arg1, arg2, arg3);
	}

	@Override
	public void error(String arg0) {
		logger.error(arg0);
	}

	@Override
	public void error(String arg0, Object arg1) {
		logger.error(arg0, arg1);
	}

	@Override
	public void error(String arg0, Object... arg1) {
		logger.error(arg0, arg1);
	}

	@Override
	public void error(String arg0, Throwable arg1) {
		logger.error(arg0, arg1);
	}

	@Override
	public void error(Marker arg0, String arg1) {
		logger.error(arg0, arg1);
	}

	@Override
	public void error(String arg0, Object arg1, Object arg2) {
		logger.error(arg0, arg1, arg2);
	}

	@Override
	public void error(Marker arg0, String arg1, Object arg2) {
		logger.error(arg0, arg1, arg2);
	}

	@Override
	public void error(Marker arg0, String arg1, Object... arg2) {
		logger.error(arg0, arg1, arg2);
	}

	@Override
	public void error(Marker arg0, String arg1, Throwable arg2) {
		logger.error(arg0, arg1, arg2);
	}

	@Override
	public void error(Marker arg0, String arg1, Object arg2, Object arg3) {
		logger.error(arg0, arg1, arg2, arg3);
	}

	@Override
	public String getName() {
		return logger.getName();
	}

	@Override
	public void info(String arg0) {
		logger.info(arg0);
	}

	@Override
	public void info(String arg0, Object arg1) {
		logger.info(arg0, arg1);
	}

	@Override
	public void info(String arg0, Object... arg1) {
		logger.info(arg0, arg1);
	}

	@Override
	public void info(String arg0, Throwable arg1) {
		logger.info(arg0, arg1);
	}

	@Override
	public void info(Marker arg0, String arg1) {
		logger.info(arg0, arg1);
	}

	@Override
	public void info(String arg0, Object arg1, Object arg2) {
		logger.info(arg0, arg1, arg2);
	}

	@Override
	public void info(Marker arg0, String arg1, Object arg2) {
		logger.info(arg0, arg1, arg2);
	}

	@Override
	public void info(Marker arg0, String arg1, Object... arg2) {
		logger.info(arg0, arg1, arg2);
	}

	@Override
	public void info(Marker arg0, String arg1, Throwable arg2) {
		logger.info(arg0, arg1, arg2);
	}

	@Override
	public void info(Marker arg0, String arg1, Object arg2, Object arg3) {
		logger.info(arg0, arg1, arg2, arg3);
	}

	@Override
	public boolean isDebugEnabled() {
		return logger.isDebugEnabled();
	}

	@Override
	public boolean isDebugEnabled(Marker arg0) {
		return logger.isDebugEnabled(arg0);
	}

	@Override
	public boolean isErrorEnabled() {
		return logger.isErrorEnabled();
	}

	@Override
	public boolean isErrorEnabled(Marker arg0) {
		return logger.isErrorEnabled(arg0);
	}

	@Override
	public boolean isInfoEnabled() {
		return logger.isInfoEnabled();
	}

	@Override
	public boolean isInfoEnabled(Marker arg0) {
		return logger.isInfoEnabled(arg0);
	}

	@Override
	public boolean isTraceEnabled() {
		return logger.isTraceEnabled();
	}

	@Override
	public boolean isTraceEnabled(Marker arg0) {
		return logger.isTraceEnabled(arg0);
	}

	@Override
	public boolean isWarnEnabled() {
		return logger.isWarnEnabled();
	}

	@Override
	public boolean isWarnEnabled(Marker arg0) {
		return logger.isWarnEnabled(arg0);
	}

	@Override
	public void trace(String arg0) {
		logger.trace(arg0);
	}

	@Override
	public void trace(String arg0, Object arg1) {
		logger.trace(arg0, arg1);
	}

	@Override
	public void trace(String arg0, Object... arg1) {
		logger.trace(arg0, arg1);
	}

	@Override
	public void trace(String arg0, Throwable arg1) {
		logger.trace(arg0, arg1);
	}

	@Override
	public void trace(Marker arg0, String arg1) {
		logger.trace(arg0, arg1);
	}

	@Override
	public void trace(String arg0, Object arg1, Object arg2) {
		logger.trace(arg0, arg1, arg2);
	}

	@Override
	public void trace(Marker arg0, String arg1, Object arg2) {
		logger.trace(arg0, arg1, arg2);
	}

	@Override
	public void trace(Marker arg0, String arg1, Object... arg2) {
		logger.trace(arg0, arg1, arg2);
	}

	@Override
	public void trace(Marker arg0, String arg1, Throwable arg2) {
		logger.trace(arg0, arg1, arg2);
	}

	@Override
	public void trace(Marker arg0, String arg1, Object arg2, Object arg3) {
		logger.trace(arg0, arg1, arg2, arg3);
	}

	@Override
	public void warn(String arg0) {
		logger.warn(arg0);
	}

	@Override
	public void warn(String arg0, Object arg1) {
		logger.warn(arg0, arg1);
	}

	@Override
	public void warn(String arg0, Object... arg1) {
		logger.warn(arg0, arg1);
	}

	@Override
	public void warn(String arg0, Throwable arg1) {
		logger.warn(arg0, arg1);
	}

	@Override
	public void warn(Marker arg0, String arg1) {
		logger.warn(arg0, arg1);
	}

	@Override
	public void warn(String arg0, Object arg1, Object arg2) {
		logger.warn(arg0, arg1, arg2);
	}

	@Override
	public void warn(Marker arg0, String arg1, Object arg2) {
		logger.warn(arg0, arg1, arg2);
	}

	@Override
	public void warn(Marker arg0, String arg1, Object... arg2) {
		logger.warn(arg0, arg1, arg2);
	}

	@Override
	public void warn(Marker arg0, String arg1, Throwable arg2) {
		logger.warn(arg0, arg1, arg2);
	}

	@Override
	public void warn(Marker arg0, String arg1, Object arg2, Object arg3) {
		logger.warn(arg0, arg1, arg2, arg3);
	}
}
