package com.ossys.ae.api.objects;

import java.util.List;

import com.ossys.ae.api.enums.BuildtoolType;
import com.ossys.ae.api.enums.FrameworkType;
import com.ossys.ae.api.enums.LanguageType;
import com.ossys.ae.api.enums.OrmType;

public interface DomainModelInterface {

	public String getName();
	public String getNamespace();
	public String getDatasourceName();
	public DataSourceInterface getDatasource(String name);
	public List<BusinessObjectInterface> getBusinessObjects();
	public boolean isConcurrent();
	public LanguageType getLanguageType();
	public FrameworkType getFrameworkType();
	public BuildtoolType getBuildtoolType();
	public OrmType getOrmType();
	
}
