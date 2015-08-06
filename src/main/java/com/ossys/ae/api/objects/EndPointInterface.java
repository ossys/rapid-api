package com.ossys.ae.api.objects;

import com.ossys.ae.api.enums.HttpMethodType;

public interface EndPointInterface {

	public String getUrl();
	public HttpMethodType getMethodType();
	
}
