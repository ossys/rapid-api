package com.ossys.rapd.api.objects;

import java.util.List;

import com.ossys.rapd.api.enums.HttpMethodType;

public interface EndPointInterface {

	public String getName();
	public String getUrl();
	public HttpMethodType getMethodType();
	public List<QueryAttributeInterface> getQueryAttributes();
	
}
