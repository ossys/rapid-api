package com.ossys.rapid.exceptions;

import com.ossys.rapid.api.enums.ErrorCode;

public class SystemModelValidationException extends Exception implements ExceptionInterface  {
	private static final long serialVersionUID = -7655576475044926975L;
	private static final ErrorCode code = ErrorCode.ERROR_SYSTEM_MODEL_VALIDATION_FAILED;

	public SystemModelValidationException(String msg) {
		super("Error validating system model: " + msg);
	}

	@Override
	public ErrorCode getErrorCode() {
		return code;
	}
	
}