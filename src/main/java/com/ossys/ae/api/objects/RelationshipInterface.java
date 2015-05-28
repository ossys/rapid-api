package com.ossys.ae.api.objects;

import com.ossys.ae.api.enums.RelationshipConstraintType;
import com.ossys.ae.api.enums.RelationshipType;

public interface RelationshipInterface {

	public String getSubjectVerb();
	public String getObjectVerb();
	public String getObject();
	public RelationshipType getType();
	public RelationshipConstraintType getOnDelete();
	public RelationshipConstraintType getOnUpdate();
	public boolean isRequired();
	public boolean isBidirectional();
	
}
