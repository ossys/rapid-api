package com.ossys.rapid.api.objects;

import java.util.List;

import com.ossys.rapid.api.enums.AttributeType;
import com.ossys.rapid.api.enums.RelationshipType;
import com.ossys.rapid.api.enums.ValidationType;

public interface BusinessObjectInterface {
	
	public String getName();
	public String getComment();
	public boolean isConcurrent();
	public boolean isAuditable();
	public boolean isAtomic();
	public boolean isPersistent();
	public boolean isEmbedded();
	public boolean embeds(String name);
	public boolean hasAttribute(AttributeInterface a);
	public boolean hasAttribute(String name);
	public AttributeInterface getAttribute(AttributeInterface a);
	public AttributeInterface getAttribute(String name);
	public List<RelationshipInterface> getRelationships();
	public RelationshipInterface getRelationship(int index);
	public RelationshipInterface getNextRelationship();
	public List<KeyInterface> getKeys();
	public List<KeyInterface> getUniqueKeys();
	public List<KeyInterface> getForeignKeys();
	public List<KeyInterface> getPrimaryKeys();
	public boolean relationshipIsRequired(String name);
	public boolean hasReferrerRelationship(RelationshipType type);
	public boolean hasReferredRelationship(RelationshipType type);
	public List<PairInterface<BusinessObjectInterface, RelationshipInterface>> getReferredRelationships(RelationshipType type);
	public List<RelationshipInterface> getReferrerRelationships(RelationshipType type);
	public List<BusinessObjectInterface> getReferredBusinessObjects(RelationshipType type);
	public List<BusinessObjectInterface> getReferrerBusinessObjects(RelationshipType type);
	public RelationshipInterface getReferrerRelationship(BusinessObjectInterface bo, RelationshipType type);
	public BusinessObjectInterface getBusinessObjectByName(String name);
	public List<AttributeInterface> getAllAttributes();
	public boolean hasAttributeOfType(AttributeType type);
	public boolean hasRequiredAttribute();
	public boolean hasUniqueAttribute();
	public boolean attributeIsUnique(AttributeInterface a);
	public boolean hasAttributeOfValidationType(ValidationType type);
	public boolean hasAttributeWithMinMaxLengthSet();
	public boolean hasEncryptedAttribute();
	
}
