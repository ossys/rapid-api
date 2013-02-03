package com.purlogic.ae.api.objects;

import java.util.List;

import com.purlogic.ae.api.enums.FrameworkType;
import com.purlogic.ae.api.enums.LanguageType;
import com.purlogic.ae.api.enums.OrmType;

public interface DomainModelInterface {

	public boolean exists();
	public String getName();
	public String getNamespace();
	public String getDatasourceName();
	public DataSourceInterface getDatasource(String name);
	public List<BusinessObjectInterface> getBusinessObjects();
	public boolean isConcurrent();
	public LanguageType getLanguageType();
	public FrameworkType getFrameworkType();
	public OrmType getOrmType();
	
}
