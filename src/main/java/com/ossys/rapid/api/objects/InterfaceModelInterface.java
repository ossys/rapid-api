package com.ossys.rapid.api.objects;

import java.util.List;

import com.ossys.rapid.api.enums.CharacterSetType;
import com.ossys.rapid.api.enums.InterfaceType;
import com.ossys.rapid.api.enums.ResponseType;

public interface InterfaceModelInterface {

	public String getName();
	public InterfaceType getInterfaceType();
	public ResponseType getResponseType();
	public String getHost();
	public CharacterSetType getCharacterSet();
	public List<EndPointInterface> getEndPoints();
	
}
