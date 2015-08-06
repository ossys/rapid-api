package com.ossys.ae.api.objects;

import com.ossys.ae.api.enums.CharacterSetType;
import com.ossys.ae.api.enums.InterfaceType;
import com.ossys.ae.api.enums.ResponseType;

public interface InterfaceModelInterface {

	public String getName();
	public InterfaceType getInterfaceType();
	public ResponseType getResponseType();
	public String getHost();
	public CharacterSetType getCharacterSet();
	
}
