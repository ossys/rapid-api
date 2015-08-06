package com.ossys.ae.model.ae;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;

import com.ossys.ae.model.ae.entities.UserEntity;

@Entity("user")
public class User extends UserEntity {

	public User() {
		super();
	}

	public User(ObjectId id) {
		super(id);
	}

}