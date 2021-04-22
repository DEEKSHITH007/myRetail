package com.myRetail.assessment.model;

public class Product {

	private String ID;

	private CurrentPrice currentPrice;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public CurrentPrice getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(CurrentPrice currentPrice) {
		this.currentPrice = currentPrice;
	}

}
