package com.ossys.rapid.api.objects;

import java.util.List;

import com.ossys.rapid.api.enums.FrameworkType;
import com.ossys.rapid.api.enums.LanguageType;
import com.ossys.rapid.api.enums.OrmType;
import com.ossys.rapid.api.enums.TesterType;

public interface DomainModelInterface {

	public String getName();
	public String getDirectoryName();
	public String getDatasourceName();
	public DataSourceInterface getDatasource();
	public List<BusinessObjectInterface> getBusinessObjects();
	public boolean isConcurrent();
	public LanguageType getLanguageType();
	public FrameworkType getFrameworkType();
	public OrmType getOrmType();
	public String getNamespace();
	public TesterType getTesterType();
	public List<InterfaceModelInterface> getInterfaces();
	
}
