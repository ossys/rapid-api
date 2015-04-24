package com.ossys.ae.api.objects;

import java.util.List;

public interface ProjectInterface {
	
	public String getName();
	@Deprecated
	public String getLocation();
	public List<DomainModelInterface> getDomainModels();
	public void addDomainModel(DomainModelInterface model);
	
}
