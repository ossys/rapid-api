package com.ossys.ae.model.activeengine.entities;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import com.ossys.ae.model.activeengine.System;

@Entity("system")
public class SystemEntity {

	@Id
	protected ObjectId id = null;

	protected String name = "";

	protected static List<System> systems = null;

	protected SystemEntity() { }

	protected SystemEntity(ObjectId id) {
		this.id = id;
		this.findById();
	}

	public void findById() { }

	public ObjectId getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public static List<System> getSystems() {
		SystemEntity.systems = new ArrayList<System>();

		return SystemEntity.systems;
	}

	public static List<System> getSystems(int start, int limit) {
		List<System> systems = new ArrayList<System>(limit);

		return systems;
	}

}