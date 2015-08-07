package com.ossys.ae.api.objects;

import java.util.List;

import com.ossys.ae.api.enums.HttpMethodType;

public interface EndPointInterface {

	public String getName();
	public String getUrl();
	public HttpMethodType getMethodType();
	public List<QueryAttributeInterface> getQueryAttributes();
	
}
