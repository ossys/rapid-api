package com.ossys.ae.api;

public interface BuildtoolGenerator {
	
	public boolean generateDirectoryStructure();
	public boolean generateArtifacts();
	public boolean addResources();
	
}
