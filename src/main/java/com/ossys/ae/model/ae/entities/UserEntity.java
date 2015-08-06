package com.ossys.ae.model.ae.entities;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import com.ossys.ae.model.ae.User;

@Entity("user")
public class UserEntity {

	@Id
	protected ObjectId id = null;

	protected String username = "";
	protected String email = "";
	protected String password = "";
	protected String first_name = null;
	protected String last_name = null;

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

	public String getUsername() {
		return this.username;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPassword() {
		return this.password;
	}

	public String getFirstName() {
		return this.first_name;
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