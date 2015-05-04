package com.ossys.ae.api.objects;

import java.util.List;
import java.util.Set;

import com.ossys.ae.api.enums.BuildtoolType;
import com.ossys.ae.api.enums.FrameworkType;
import com.ossys.ae.api.enums.LanguageType;

public interface ProjectInterface {
	
	public String getName();
	public String getDirectoryName();
	public BuildtoolType getBuildtoolType();
	public String getGroupId();
	public String getRootPath();
	public List<DomainModelInterface> getDomainModels();
	public Set<LanguageType> getLanguageTypes();
	public int getLanguageIndex(LanguageType type);
	public void addDomainModel(DomainModelInterface model);
	public boolean hasFrameworkType(FrameworkType type);
	
}
