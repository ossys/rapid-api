package com.ossys.rapid.api;

public interface ModelGenerator {

	public void generateDatasources();
	public void generateEntities();
	public void generateObjects();
	public void generateExceptions();
	public void generateUtils();

	public void saveDatasources();
	public void saveEntities();
	public void saveObjects();
	public void saveExceptions();
	public void saveUtils();
	
}
