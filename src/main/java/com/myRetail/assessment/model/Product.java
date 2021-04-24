package com.myRetail.assessment.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@DynamoDBTable(tableName = "Product")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {

	private String ID;
	
	private String name;

	private String desc;

	private CurrentPrice currentPrice;

	@JsonProperty("ID")
	@DynamoDBHashKey(attributeName = "ID")
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	@JsonProperty("CurrentPrice")
	@DynamoDBAttribute(attributeName = "CurrentPrice")
	public CurrentPrice getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(CurrentPrice currentPrice) {
		this.currentPrice = currentPrice;
	}

	@JsonProperty("Name")
	@DynamoDBAttribute(attributeName = "Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("Description")
	@DynamoDBAttribute(attributeName = "Description")
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
