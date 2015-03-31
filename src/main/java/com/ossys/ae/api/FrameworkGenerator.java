package com.ossys.ae.api;

public interface FrameworkGenerator {
	
	public boolean generateDirectoryStructure();
	public boolean generateArtifacts();
	public boolean addResources();
	public String getDirectory(String name);
	@Deprecated
	public String getRoot();
	@Deprecated
	public String getIncludeRoot();
	@Deprecated
	public String getModelRoot();
	@Deprecated
	public String getEntitiesRoot();
	@Deprecated
	public String getExceptionsRoot();
	@Deprecated
	public String getUtilsRoot();
	@Deprecated
	public String getTestsRoot();
	@Deprecated
	public String getDbRoot();
	@Deprecated
	public String getDbLibRoot();
	@Deprecated
	public String getControllersRoot();
	@Deprecated
	public String getRouterRoot();
	public String getModelNamespace(String namespace);
	public String getEntityNamespace(String namespace);
	public String getDBNamespace(String namespace);
	public String getUtilsNamespace(String namespace);
	public String getExceptionsNamespace(String namespace);
	
}
