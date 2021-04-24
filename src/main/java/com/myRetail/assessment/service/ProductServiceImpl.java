package com.myRetail.assessment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myRetail.assessment.dao.ProductDAO;
import com.myRetail.assessment.model.Product;
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDAO productRepo;

	@Override
	public Product getProductById(String id) {
		return productRepo.getProductById(id);
	}

	@Override
	public void updateProduct(Product product) {
		productRepo.updateProduct(product);
	}

	@Override
	public Product createProduct(Product product) {
		return productRepo.createProduct(product);
	}

	@Override
	public void deleteProduct(String id) {
		productRepo.deleteProduct(id);
	}

}
