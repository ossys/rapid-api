package com.ossys.ae.api.objects;

import java.util.List;

import com.ossys.ae.api.enums.KeyType;

public interface KeyInterface {

    public KeyType getType();
    public List<AttributeInterface> getKeyAttributes();
    
}
