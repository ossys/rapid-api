package com.purlogic.ae.api.objects;

import com.purlogic.ae.api.enums.DatasourceType;

public interface DataSourceInterface {

	public String getName();
	public String getHost();
	public String getUsername();
	public String getPassword();
	public String getSchema();
	public int getPort();
	public DatasourceType getType();
	
}
