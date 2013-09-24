package com.purlogic.ae.api.objects;

import com.purlogic.ae.api.enums.RelationshipConstraintType;
import com.purlogic.ae.api.enums.RelationshipType;

public interface RelationshipInterface {

	public String getVerb();
	public String getReferred();
	public RelationshipType getType();
	public RelationshipConstraintType getOnDelete();
	public RelationshipConstraintType getOnUpdate();
	public boolean isRequired();
	
}
