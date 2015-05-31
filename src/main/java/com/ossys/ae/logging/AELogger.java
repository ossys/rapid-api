package com.ossys.ae.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

public class AELogger implements AELoggerInterface {
	Logger logger = null;
	
	boolean verbose = false;
	boolean debug = false;
	boolean error = false;
	boolean info = false;
	boolean trace = false;
	boolean warn = false;
	
	public AELogger(Class<?> cls) {
		this.logger = LoggerFactory.getLogger(cls);
	}
	
	public void enableVerbose() {
		this.verbose = true;
	}
	
	public void enableDebug() {
		this.debug = true;
	}
	
	public void enableError() {
		this.error = true;
	}
	
	public void enableInfo() {
		this.info = true;
	}
	
	public void enableTrace() {
		this.trace = true;
	}
	
	public void enableWarn() {
		this.warn = true;
	}

	@Override
	public void debug(String arg0) {
		if(this.debug || this.verbose) {
			logger.debug(arg0);
		}
	}

	@Override
	public void debug(String arg0, Object arg1) {
		if(this.debug || this.verbose) {
			logger.debug(arg0, arg1);
		}
	}

	@Override
	public void debug(String arg0, Object... arg1) {
		if(this.debug || this.verbose) {
			logger.debug(arg0, arg1);
		}
	}

	@Override
	public void debug(String arg0, Throwable arg1) {
		if(this.debug || this.verbose) {
			logger.debug(arg0, arg1);
		}
	}

	@Override
	public void debug(Marker arg0, String arg1) {
		if(this.debug || this.verbose) {
			logger.debug(arg0, arg1);
		}
	}

	@Override
	public void debug(String arg0, Object arg1, Object arg2) {
		if(this.debug || this.verbose) {
			logger.debug(arg0, arg1, arg2);
		}
	}

	@Override
	public void debug(Marker arg0, String arg1, Object arg2) {
		if(this.debug || this.verbose) {
			logger.debug(arg0, arg1, arg2);
		}
	}

	@Override
	public void debug(Marker arg0, String arg1, Object... arg2) {
		if(this.debug || this.verbose) {
			logger.debug(arg0, arg1, arg2);
		}
	}

	@Override
	public void debug(Marker arg0, String arg1, Throwable arg2) {
		if(this.debug || this.verbose) {
			logger.debug(arg0, arg1, arg2);
		}
	}

	@Override
	public void debug(Marker arg0, String arg1, Object arg2, Object arg3) {
		if(this.debug || this.verbose) {
			logger.debug(arg0, arg1, arg2, arg3);
		}
	}

	@Override
	public void error(String arg0) {
		if(this.error || this.verbose) {
			logger.error(arg0);
		}
	}

	@Override
	public void error(String arg0, Object arg1) {
		if(this.error || this.verbose) {
			logger.error(arg0, arg1);
		}
	}

	@Override
	public void error(String arg0, Object... arg1) {
		if(this.error || this.verbose) {
			logger.error(arg0, arg1);
		}
	}

	@Override
	public void error(String arg0, Throwable arg1) {
		if(this.error || this.verbose) {
			logger.error(arg0, arg1);
		}
	}

	@Override
	public void error(Marker arg0, String arg1) {
		if(this.error || this.verbose) {
			logger.error(arg0, arg1);
		}
	}

	@Override
	public void error(String arg0, Object arg1, Object arg2) {
		if(this.error || this.verbose) {
			logger.error(arg0, arg1, arg2);
		}
	}

	@Override
	public void error(Marker arg0, String arg1, Object arg2) {
		if(this.error || this.verbose) {
			logger.error(arg0, arg1, arg2);
		}
	}

	@Override
	public void error(Marker arg0, String arg1, Object... arg2) {
		if(this.error || this.verbose) {
			logger.error(arg0, arg1, arg2);
		}
	}

	@Override
	public void error(Marker arg0, String arg1, Throwable arg2) {
		if(this.error || this.verbose) {
			logger.error(arg0, arg1, arg2);
		}
	}

	@Override
	public void error(Marker arg0, String arg1, Object arg2, Object arg3) {
		if(this.error || this.verbose) {
			logger.error(arg0, arg1, arg2, arg3);
		}
	}

	@Override
	public String getName() {
		return logger.getName();
	}

	@Override
	public void info(String arg0) {
		if(this.info || this.verbose) {
			logger.info(arg0);
		}
	}

	@Override
	public void info(String arg0, Object arg1) {
		if(this.info || this.verbose) {
			logger.info(arg0, arg1);
		}
	}

	@Override
	public void info(String arg0, Object... arg1) {
		if(this.info || this.verbose) {
			logger.info(arg0, arg1);
		}
	}

	@Override
	public void info(String arg0, Throwable arg1) {
		if(this.info || this.verbose) {
			logger.info(arg0, arg1);
		}
	}

	@Override
	public void info(Marker arg0, String arg1) {
		if(this.info || this.verbose) {
			logger.info(arg0, arg1);
		}
	}

	@Override
	public void info(String arg0, Object arg1, Object arg2) {
		if(this.info || this.verbose) {
			logger.info(arg0, arg1, arg2);
		}
	}

	@Override
	public void info(Marker arg0, String arg1, Object arg2) {
		if(this.info || this.verbose) {
			logger.info(arg0, arg1, arg2);
		}
	}

	@Override
	public void info(Marker arg0, String arg1, Object... arg2) {
		if(this.info || this.verbose) {
			logger.info(arg0, arg1, arg2);
		}
	}

	@Override
	public void info(Marker arg0, String arg1, Throwable arg2) {
		if(this.info || this.verbose) {
			logger.info(arg0, arg1, arg2);
		}
	}

	@Override
	public void info(Marker arg0, String arg1, Object arg2, Object arg3) {
		if(this.info || this.verbose) {
			logger.info(arg0, arg1, arg2, arg3);
		}
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
		if(this.trace || this.verbose) {
			logger.trace(arg0);
		}
	}

	@Override
	public void trace(String arg0, Object arg1) {
		if(this.trace || this.verbose) {
			logger.trace(arg0, arg1);
		}
	}

	@Override
	public void trace(String arg0, Object... arg1) {
		if(this.trace || this.verbose) {
			logger.trace(arg0, arg1);
		}
	}

	@Override
	public void trace(String arg0, Throwable arg1) {
		if(this.trace || this.verbose) {
			logger.trace(arg0, arg1);
		}
	}

	@Override
	public void trace(Marker arg0, String arg1) {
		if(this.trace || this.verbose) {
			logger.trace(arg0, arg1);
		}
	}

	@Override
	public void trace(String arg0, Object arg1, Object arg2) {
		if(this.trace || this.verbose) {
			logger.trace(arg0, arg1, arg2);
		}
	}

	@Override
	public void trace(Marker arg0, String arg1, Object arg2) {
		if(this.trace || this.verbose) {
			logger.trace(arg0, arg1, arg2);
		}
	}

	@Override
	public void trace(Marker arg0, String arg1, Object... arg2) {
		if(this.trace || this.verbose) {
			logger.trace(arg0, arg1, arg2);
		}
	}

	@Override
	public void trace(Marker arg0, String arg1, Throwable arg2) {
		if(this.trace || this.verbose) {
			logger.trace(arg0, arg1, arg2);
		}
	}

	@Override
	public void trace(Marker arg0, String arg1, Object arg2, Object arg3) {
		if(this.trace || this.verbose) {
			logger.trace(arg0, arg1, arg2, arg3);
		}
	}

	@Override
	public void warn(String arg0) {
		if(this.warn || this.verbose) {
			logger.warn(arg0);
		}
	}

	@Override
	public void warn(String arg0, Object arg1) {
		if(this.warn || this.verbose) {
			logger.warn(arg0, arg1);
		}
	}

	@Override
	public void warn(String arg0, Object... arg1) {
		if(this.warn || this.verbose) {
			logger.warn(arg0, arg1);
		}
	}

	@Override
	public void warn(String arg0, Throwable arg1) {
		if(this.warn || this.verbose) {
			logger.warn(arg0, arg1);
		}
	}

	@Override
	public void warn(Marker arg0, String arg1) {
		if(this.warn || this.verbose) {
			logger.warn(arg0, arg1);
		}
	}

	@Override
	public void warn(String arg0, Object arg1, Object arg2) {
		if(this.warn || this.verbose) {
			logger.warn(arg0, arg1, arg2);
		}
	}

	@Override
	public void warn(Marker arg0, String arg1, Object arg2) {
		if(this.warn || this.verbose) {
			logger.warn(arg0, arg1, arg2);
		}
	}

	@Override
	public void warn(Marker arg0, String arg1, Object... arg2) {
		if(this.warn || this.verbose) {
			logger.warn(arg0, arg1, arg2);
		}
	}

	@Override
	public void warn(Marker arg0, String arg1, Throwable arg2) {
		if(this.warn || this.verbose) {
			logger.warn(arg0, arg1, arg2);
		}
	}

	@Override
	public void warn(Marker arg0, String arg1, Object arg2, Object arg3) {
		if(this.warn || this.verbose) {
			logger.warn(arg0, arg1, arg2, arg3);
		}
	}
}
