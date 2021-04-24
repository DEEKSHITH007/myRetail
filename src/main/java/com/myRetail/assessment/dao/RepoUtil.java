package com.myRetail.assessment.dao;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class RepoUtil {
	
	public DynamoDBMapper mapper() {
		return new DynamoDBMapper(amazondynamodbConfig());
	}

	public AmazonDynamoDB amazondynamodbConfig() {

		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
				.withCredentials(new DefaultAWSCredentialsProviderChain()).withRegion("ap-south-1").build();
		return client;
	}
}
