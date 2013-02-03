package com.purlogic.ae.api.objects;

import java.util.List;

public interface SystemModelInterface {

	public boolean exists();
	public void parse();
	public List<DataSourceInterface> getDatasources();
	public List<ProjectInterface> getProjects();
	public DataSourceInterface getDatasource(String name);
	public ProjectInterface getProject(String name);
	
}