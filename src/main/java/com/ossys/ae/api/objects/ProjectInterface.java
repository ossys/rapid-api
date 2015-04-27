package com.ossys.ae.api.objects;

import java.util.List;

public interface ProjectInterface {
	
	public String getName();
	public String getDirectoryName();
	public String getRootPath();
	public List<DomainModelInterface> getDomainModels();
	public void addDomainModel(DomainModelInterface model);
	
}
