package com.ossys.rapid.api.objects;

import java.util.List;
import java.util.Set;

import com.ossys.rapid.api.enums.BuildtoolType;
import com.ossys.rapid.api.enums.FrameworkType;
import com.ossys.rapid.api.enums.LanguageType;

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
	public boolean hasInterfaces();
	public boolean hasInterfaces(DomainModelInterface dm);
	
}
