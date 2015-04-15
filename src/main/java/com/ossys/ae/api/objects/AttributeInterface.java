package com.ossys.ae.api.objects;

import java.util.List;

import com.ossys.ae.api.enums.AttributeEncryptionType;
import com.ossys.ae.api.enums.AttributeType;
import com.ossys.ae.api.enums.LanguageType;
import com.ossys.ae.api.enums.ValidationType;

public interface AttributeInterface {
	
	public String getName();
	public Long getMaxByteNum();
	public String getMaxByteChars();
	public Boolean isRequired();
	public Boolean isPersistent();
	public String getDefault();
	public String getComment();
	public Long getMaxsize();
	public Long getMinsize();
	public Long getPrecision();
	public Boolean isSigned();
	public Boolean isArray();
	public String getRegex();
	public String getEnumReference();
	public List<EnumInterface> getEnums();
	public AttributeType getType(LanguageType platform);
	public AttributeEncryptionType getEncryptionType();
	public ValidationType getValidationType();
	public Boolean hasAttributes();

}
