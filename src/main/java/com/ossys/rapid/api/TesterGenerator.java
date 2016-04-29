package com.ossys.rapid.api;

public interface TesterGenerator {

	public void generateTestSuite();
	public void generateUnitTests();
	public void generateIntegrationTests();
	public void generateBenchmarkTests();
	
	public void saveTests();
}
