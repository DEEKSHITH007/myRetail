package com.myRetail.assessment.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonProperty;

@DynamoDBDocument
public class CurrentPrice {

	private int value;

	private String currencyMode;

	@DynamoDBAttribute(attributeName = "Value")
	@JsonProperty("Value")
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@JsonProperty("Currency")
	@DynamoDBAttribute(attributeName = "Currency")
	public String getCurrencyMode() {
		return currencyMode;
	}

	public void setCurrencyMode(String currencyMode) {
		this.currencyMode = currencyMode;
	}

}
