package com.myRetail.assessment.dao;

import com.myRetail.assessment.model.Product;

public interface ProductDAO {

	public Product getProductById(String id);
	
	public void updateProduct(Product product);
	
	public Product createProduct(Product product);
	
	public void deleteProduct(String id);
	
}
