package com.ossys.ae.api.objects;

import java.util.List;

import com.ossys.ae.api.enums.AttributeEncryptionType;
import com.ossys.ae.api.enums.AttributeType;
import com.ossys.ae.api.enums.LanguageType;
import com.ossys.ae.api.enums.ValidationType;

public interface AttributeInterface {
	
	public String getName();
	public long getMaxByteNum();
	public String getMaxByteChars();
	public boolean isRequired();
	public boolean isPersistent();
	public String getDefault();
	public String getComment();
	public long getMaxsize();
	public long getMinsize();
	public long getPrecision();
	public boolean isSigned();
	public boolean isArray();
	public String getRegex();
	public String getEnumReference();
	public List<EnumInterface> getEnums();
	public AttributeType getType(LanguageType platform);
	public AttributeEncryptionType getEncryptionType();
	public ValidationType getValidationType();
	public boolean hasAttributes();

}
