package com.ossys.ae.api.objects;

import java.util.List;
import java.util.Set;

import com.ossys.ae.api.enums.BuildtoolType;
import com.ossys.ae.api.enums.FrameworkType;
import com.ossys.ae.api.enums.LanguageType;
import com.ossys.ae.api.enums.OrmType;
import com.ossys.ae.api.enums.TesterType;

public interface DomainModelInterface {

	public boolean isValid();
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
	
}
