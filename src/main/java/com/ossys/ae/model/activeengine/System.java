package com.ossys.ae.model.activeengine;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;

import com.ossys.ae.model.activeengine.entities.SystemEntity;

@Entity("system")
public class System extends SystemEntity {

	public System() {
		super();
	}

	public System(ObjectId id) {
		super(id);
	}

}