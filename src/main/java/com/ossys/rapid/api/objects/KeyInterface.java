package com.ossys.rapid.api.objects;

import java.util.List;

import com.ossys.rapid.api.enums.KeyType;

public interface KeyInterface {

    public KeyType getType();
    public List<AttributeInterface> getKeyAttributes();
    
}
