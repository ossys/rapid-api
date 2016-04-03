package com.ossys.rapd.api.objects;

import java.util.List;

import com.ossys.rapd.api.enums.KeyType;

public interface KeyInterface {

    public KeyType getType();
    public List<AttributeInterface> getKeyAttributes();
    
}
