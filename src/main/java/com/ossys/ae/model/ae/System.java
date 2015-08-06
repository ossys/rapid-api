package com.ossys.ae.model.ae;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;

import com.ossys.ae.model.ae.entities.SystemEntity;

@Entity("system")
public class System extends SystemEntity {

	public System() {
		super();
	}

	public System(ObjectId id) {
		super(id);
	}

}