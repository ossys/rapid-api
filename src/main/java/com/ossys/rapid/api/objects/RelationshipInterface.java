package com.ossys.rapid.api.objects;

import com.ossys.rapid.api.enums.RelationshipConstraintType;
import com.ossys.rapid.api.enums.RelationshipType;

public interface RelationshipInterface {

	public String getSubjectVerb();
	public String getObjectVerb();
	public String getObject();
	public RelationshipType getType();
	public RelationshipConstraintType getOnDelete();
	public RelationshipConstraintType getOnUpdate();
	public boolean isRequired();
	public boolean isBidirectional();
	public boolean isEmbedded();
	public boolean allowsMulti();
	
}
