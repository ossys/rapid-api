package com.purlogic.ae.api.objects;

import java.util.List;

public interface ProjectInterface {
	
	public String getName();
	public String getLocation();
	public List<DomainModelInterface> getDomainModels();
	public void addDomainModel(DomainModelInterface model);
	
}
