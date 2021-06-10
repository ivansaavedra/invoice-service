package com.invoiceservice.api.invoice.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Collections;

@Configuration
@EnableMongoRepositories(basePackages="com.invoiceservice.api.invoice.repository")
@ComponentScan(basePackages = {"com.invoiceservice"})
public class MongoDBConfiguration  extends AbstractMongoClientConfiguration {

	@Override
    protected Collection<String> getMappingBasePackages() {
        return Collections.singleton("com.invoiceservice.api");
    }
    
    @Bean
    public MongoTemplate mongoTemplate()
        throws UnknownHostException, java.net.UnknownHostException {
    return new MongoTemplate(
            new SimpleMongoDbFactory(
                        mongoClient(),
                        getDatabaseName()
                )
        );
    }

    @Override
    @Bean
    public MongoClient mongoClient()  {
    	
    	MongoCredential credential = MongoCredential.createCredential("fernando","admin", "12345".toCharArray());

        MongoClientSettings settings = MongoClientSettings.builder()
                .credential(credential)
                .applyToSslSettings(builder -> builder.enabled(true))
                .applyConnectionString(new ConnectionString("mongodb://" + "localhost" + ":" + 27017 + "/?ssl=false"))
                .build();

        MongoClient mongoClient = MongoClients.create(settings);

        return mongoClient;
    }

    @Override
    protected String getDatabaseName() {
        return "admin";
    }
}
    