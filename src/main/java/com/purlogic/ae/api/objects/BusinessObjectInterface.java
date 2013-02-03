package com.purlogic.ae.api.objects;

import java.util.List;

import com.purlogic.ae.api.enums.AttributeType;
import com.purlogic.ae.api.enums.RelationshipType;

public interface BusinessObjectInterface {
	
	public String getName();
	public String getComment();
	public boolean isConcurrent();
	public boolean isAuditable();
	public boolean isAtomic();
	public boolean isPersistent();
	public AttributeInterface getAttribute(String name);
	public List<RelationshipInterface> getRelationships();
	public List<KeyInterface> getKeys();
	public List<KeyInterface> getUniqueKeys();
	public List<KeyInterface> getForeignKeys();
	public List<KeyInterface> getPrimaryKeys();
	public boolean relationshipIsRequired(String name);
	public boolean hasReferrerRelationship(RelationshipType type);
	public boolean hasReferredRelationship(RelationshipType type);
	public List<RelationshipInterface> getReferredRelationships(RelationshipType type);
	public List<BusinessObjectInterface> getReferredBusinessObjects(RelationshipType type);
	public List<BusinessObjectInterface> getReferrerBusinessObjects(RelationshipType type);
	public RelationshipInterface getReferrerRelationship(BusinessObjectInterface bo, RelationshipType type);
	public BusinessObjectInterface getBusinessObjectByName(String name);
	public List<AttributeInterface> getAllAttributes();
	public boolean hasAttributeOfType(AttributeType type);
	
}
