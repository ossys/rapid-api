package com.ossys.ae.api;

public interface FrameworkGenerator {
	
	public boolean generateDirectoryStructure();
	public boolean generateArtifacts();
	public boolean addResources();
	
	@Deprecated
	public String getDirectory(String name);
	public String getRoot();
	public String getIncludeRoot();
	public String getModelRoot();
	public String getEntitiesRoot();
	public String getExceptionsRoot();
	public String getUtilsRoot();
	public String getTestsRoot();
	public String getDbRoot();
	public String getDbLibRoot();
	public String getControllersRoot();
	public String getRouterRoot();
	
	public String getModelNamespace(String namespace);
	public String getEntityNamespace(String namespace);
	public String getDBNamespace(String namespace);
	public String getUtilsNamespace(String namespace);
	public String getExceptionsNamespace(String namespace);
	
}
