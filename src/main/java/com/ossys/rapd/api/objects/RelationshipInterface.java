package com.ossys.rapd.api.objects;

import com.ossys.rapd.api.enums.RelationshipConstraintType;
import com.ossys.rapd.api.enums.RelationshipType;

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
