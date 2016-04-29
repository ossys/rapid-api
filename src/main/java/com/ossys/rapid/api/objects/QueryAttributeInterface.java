package com.ossys.rapid.api.objects;

import java.util.List;

import com.ossys.rapid.api.enums.AttributeType;
import com.ossys.rapid.api.enums.LanguageType;

public interface QueryAttributeInterface {
	
	public String getName();
	public AttributeType getType(LanguageType platform);
	public String getParameter();
	public Long getMinsize();
	public Long getMaxsize();
	public String getComment();
	public boolean isRequired();
	public boolean isSigned();
	public String getDefault();
	public String getValidator();
	public Long getPrecision();
	public List<QueryAttributeEnumInterface> getEnums();

}
