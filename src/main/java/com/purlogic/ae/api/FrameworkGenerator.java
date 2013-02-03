package com.purlogic.ae.api;

public interface FrameworkGenerator {
	
	public boolean generateDirectoryStructure();
	public boolean generateArtifacts();
	public boolean addResources();
	public String getRoot();
	public String getModelRoot();
	public String getEntitiesRoot();
	public String getExceptionsRoot();
	public String getUtilsRoot();
	public String getTestsRoot();
	public String getDbRoot();
	public String getDbLibRoot();
	public String getControllersRoot();
	public String getRouterRoot();
	
}
