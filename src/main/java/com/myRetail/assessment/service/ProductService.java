package com.myRetail.assessment.service;

import com.myRetail.assessment.model.Product;

public interface ProductService {
	public Product getProductById(String id);

	public void updateProduct(Product product);

	public Product createProduct(Product product);

	public void deleteProduct(String id);
}
