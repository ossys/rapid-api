package com.ossys.ae.api.objects;

import com.ossys.ae.api.enums.DatasourceType;

public interface DataSourceInterface {

	public String getName();
	public String getDirectoryName();
	public String getHost();
	public String getUsername();
	public String getPassword();
	public String getSchema();
	public int getPort();
	public DatasourceType getType();
	
}
