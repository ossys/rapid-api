package com.ossys.ae.api;

import com.ossys.ae.api.objects.DomainModelInterface;

public interface FrameworkGenerator {
	
	public boolean generateDirectoryStructure();
	public boolean generateArtifacts();
	public boolean addResources();
	
	public String getModelSrcPath(DomainModelInterface dm);
	public String getDbSrcPath(DomainModelInterface dm);
	public String getExceptionsSrcPath(DomainModelInterface dm);
	public String getUtilsSrcPath(DomainModelInterface dm);
	public String getObjectsSrcPath(DomainModelInterface dm);
	public String getEntitiesSrcPath(DomainModelInterface dm);
	
	public String getLibSrcPath(DomainModelInterface dm);

	public String getModelIncludePath(DomainModelInterface dm);
	public String getDbIncludePath(DomainModelInterface dm);
	public String getExceptionsIncludePath(DomainModelInterface dm);
	public String getUtilsIncludePath(DomainModelInterface dm);
	public String getObjectsIncludePath(DomainModelInterface dm);
	public String getEntitiesIncludePath(DomainModelInterface dm);

	public String getTestPath(DomainModelInterface dm);
	public String getModelUnitTestPath(DomainModelInterface dm);
	public String getModelIntegrationTestPath(DomainModelInterface dm);
	public String getModelBenchmarkTestPath(DomainModelInterface dm);
	public String getTestIncludePath(DomainModelInterface dm);
	public String getModelUnitTestIncludePath(DomainModelInterface dm);
	public String getModelIntegrationTestIncludePath(DomainModelInterface dm);
	public String getModelBenchmarkTestIncludePath(DomainModelInterface dm);
	
	public String getControllersPath(DomainModelInterface dm);
	public String getRouterPath(DomainModelInterface dm);
	public String getInterfacePath(DomainModelInterface dm);
	
	public String getModelNamespace(DomainModelInterface dm);
	public String getModelObjectNamespace(DomainModelInterface dm);
	public String getModelEntityNamespace(DomainModelInterface dm);
	public String getDBNamespace(DomainModelInterface dm);
	public String getUtilsNamespace(DomainModelInterface dm);
	public String getExceptionsNamespace(DomainModelInterface dm);
	public String getTestsNamespace(DomainModelInterface dm);
	public String getModelUnitTestsNamespace(DomainModelInterface dm);
	public String getModelIntegrationTestsNamespace(DomainModelInterface dm);
	public String getModelBenchmarkTestsNamespace(DomainModelInterface dm);
	
}
