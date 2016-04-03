package com.ossys.rapd.api;

import com.ossys.rapd.api.enums.LanguageType;

public interface BuildtoolGenerator {
	
	public boolean generateDirectoryStructure();
	public boolean generateArtifacts();
	public boolean addResources();
	
	public String getSrcPath(LanguageType type);
	public String getIncludePath(LanguageType type);
	public String getTestPath(LanguageType type);
	public String getLibPath(LanguageType type);
	public String getSrcResourcePath();
	public String getTestResourcePath();
	
}
