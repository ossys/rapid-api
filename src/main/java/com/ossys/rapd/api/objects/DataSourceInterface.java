package com.ossys.rapd.api.objects;

import com.ossys.rapd.api.enums.DatasourceType;

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
