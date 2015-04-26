package com.ossys.ae.api.objects;

import java.util.List;

import com.ossys.ae.api.enums.SystemType;

public interface SystemModelInterface {
	
	public String getRootPath();
	public SystemType getSystemType();
	public List<DataSourceInterface> getDatasources();
	public List<ProjectInterface> getProjects();
	public DataSourceInterface getDatasource(String name);
	public ProjectInterface getProject(String name);
	
}