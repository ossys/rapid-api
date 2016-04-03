package com.ossys.rapd.api.objects;

import java.util.List;

import com.ossys.rapd.api.enums.CharacterSetType;
import com.ossys.rapd.api.enums.InterfaceType;
import com.ossys.rapd.api.enums.ResponseType;

public interface InterfaceModelInterface {

	public String getName();
	public InterfaceType getInterfaceType();
	public ResponseType getResponseType();
	public String getHost();
	public CharacterSetType getCharacterSet();
	public List<EndPointInterface> getEndPoints();
	
}
