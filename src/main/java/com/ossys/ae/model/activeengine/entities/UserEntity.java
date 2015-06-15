package com.ossys.ae.model.activeengine.entities;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import com.ossys.ae.model.activeengine.User;

@Entity("user")
public class UserEntity {

	@Id
	protected ObjectId id = null;

	protected String email = "";
	protected String first_name = "";
	protected String middle_name = "";
	protected String last_name = "";

	protected static List<User> users = null;

	protected UserEntity() { }

	protected UserEntity(ObjectId id) {
		this.id = id;
		this.findById();
	}

	public void findById() { }

	public ObjectId getId() {
		return this.id;
	}

	public String getEmail() {
		return this.email;
	}

	public String getFirstName() {
		return this.first_name;
	}

	public String getMiddleName() {
		return this.middle_name;
	}

	public String getLastName() {
		return this.last_name;
	}

	public static List<User> getUsers() {
		UserEntity.users = new ArrayList<User>();

		return UserEntity.users;
	}

	public static List<User> getUsers(int start, int limit) {
		List<User> users = new ArrayList<User>(limit);

		return users;
	}

}