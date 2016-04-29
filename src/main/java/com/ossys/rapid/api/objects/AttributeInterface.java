package com.ossys.rapid.api.objects;

import java.util.List;

import com.ossys.rapid.api.enums.AttributeEncryptionType;
import com.ossys.rapid.api.enums.AttributeType;
import com.ossys.rapid.api.enums.LanguageType;
import com.ossys.rapid.api.enums.ValidationType;

public interface AttributeInterface {
	
	public String getName();
	public Long getMaxByteNum();
	public String getMaxByteChars();
	public boolean isRequired();
	public boolean isPersistent();
	public String getDefault();
	public String getComment();
	public Long getMaxsize();
	public Long getMinsize();
	public Long getPrecision();
	public boolean isSigned();
	public boolean isArray();
	public String getValidator();
	public String getEnumReference();
	public List<EnumInterface> getEnums();
	public AttributeType getType(LanguageType platform);
	public AttributeEncryptionType getEncryptionType();
	public ValidationType getValidationType();

}
