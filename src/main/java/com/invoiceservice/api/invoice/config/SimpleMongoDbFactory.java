package com.invoiceservice.api.invoice.config;


import org.springframework.dao.DataAccessException;
import org.springframework.dao.support.PersistenceExceptionTranslator;
import org.springframework.data.mongodb.MongoDatabaseFactory;

import com.mongodb.ClientSessionOptions;
import com.mongodb.client.ClientSession;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class SimpleMongoDbFactory implements MongoDatabaseFactory {

	public SimpleMongoDbFactory(MongoClient mongoClient, String databaseName) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public MongoDatabase getMongoDatabase() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MongoDatabase getMongoDatabase(String dbName) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersistenceExceptionTranslator getExceptionTranslator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientSession getSession(ClientSessionOptions options) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MongoDatabaseFactory withSession(ClientSession session) {
		// TODO Auto-generated method stub
		return null;
	}

}

