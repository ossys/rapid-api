package com.ossys.ae.api.objects;

import java.util.List;

public interface SystemModelInterface {

	public boolean exists();
	public String getRootPath();
	public void parse();
	public List<DataSourceInterface> getDatasources();
	public List<ProjectInterface> getProjects();
	public DataSourceInterface getDatasource(String name);
	public ProjectInterface getProject(String name);
	
}