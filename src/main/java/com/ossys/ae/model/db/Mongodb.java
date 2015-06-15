package com.ossys.ae.model.db;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class Mongodb {

	public final static Mongodb mongodb = new Mongodb();
	private final static Morphia morphia = new Morphia();
	private static Datastore ds = null;
	
	private Mongodb() {
		Mongodb.morphia.mapPackage("com.ossys.ae.model.activeenine");
		Mongodb.morphia.mapPackage("com.ossys.ae.model.activeenine.entities");

		Datastore ds = Mongodb.morphia.createDatastore(new MongoClient(), "activeengine");
		ds.ensureIndexes();
	}
	
	public static Datastore getDatastore() {
		return Mongodb.ds;
	}
	
}