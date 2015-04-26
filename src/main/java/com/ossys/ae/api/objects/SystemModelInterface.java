package com.ossys.ae.api.objects;

import java.io.FileNotFoundException;
import java.util.List;

public interface SystemModelInterface {

	public String getRootPath();
	public void parse() throws FileNotFoundException;
	public List<DataSourceInterface> getDatasources();
	public List<ProjectInterface> getProjects();
	public DataSourceInterface getDatasource(String name);
	public ProjectInterface getProject(String name);
	
}