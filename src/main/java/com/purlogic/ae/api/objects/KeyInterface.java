package com.purlogic.ae.api.objects;

import java.util.List;

import com.purlogic.ae.api.enums.KeyType;

public interface KeyInterface {

    public KeyType getType();
    public List<AttributeInterface> getKeyAttributes();
    
}
