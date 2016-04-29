package com.ossys.rapid.api.objects;

import java.util.List;

import com.ossys.rapid.api.enums.ApiLevel;
import com.ossys.rapid.api.enums.SystemType;

public interface SystemModelInterface {
	
	public String getRootPath();
	public SystemType getSystemType();
	public List<DataSourceInterface> getDatasources();
	public List<ProjectInterface> getProjects();
	public DataSourceInterface getDatasource(String name);
	public ProjectInterface getProject(String name);
	public String getKey();
	public ApiLevel getApiLevel();
	
}