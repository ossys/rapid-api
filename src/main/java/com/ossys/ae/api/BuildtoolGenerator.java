package com.ossys.ae.api;

public interface BuildtoolGenerator {
	
	public boolean generateDirectoryStructure();
	public boolean generateArtifacts();
	public boolean addResources();
	
	public String getRoot();
	
	public String getSrcRoot();
	public String getDbSrcRoot();
	public String getEntitiesSrcRoot();
	public String getExceptionsSrcRoot();
	public String getUtilsSrcRoot();
	public String getDbLibSrcRoot();

	public String getIncludeRoot();
	public String getDbIncludeRoot();
	public String getEntitiesIncludeRoot();
	public String getExceptionsIncludeRoot();
	public String getUtilsIncludeRoot();

	public String getTestRoot();
	public String getTestSrcRoot();
	public String getTestIncludeRoot();
	
	public String getControllersRoot();
	public String getRouterRoot();
	
	public String getModelNamespace();
	public String getEntityNamespace();
	public String getDBNamespace();
	public String getUtilsNamespace();
	public String getExceptionsNamespace();
	
}
