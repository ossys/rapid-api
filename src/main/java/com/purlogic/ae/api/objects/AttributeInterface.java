package com.purlogic.ae.api.objects;

import java.util.List;

import com.purlogic.ae.api.enums.AttributeEncryptionType;
import com.purlogic.ae.api.enums.AttributeType;
import com.purlogic.ae.api.enums.LanguageType;
import com.purlogic.ae.api.enums.ValidationType;

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
	public String getRegex();
	public String getEnumReference();
	public List<EnumInterface> getEnums();
	public AttributeType getType(LanguageType platform);
	public AttributeEncryptionType getEncryptionType();
	public ValidationType getValidationType();

}
