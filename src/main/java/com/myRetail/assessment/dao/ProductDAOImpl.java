package com.myRetail.assessment.dao;

import org.springframework.stereotype.Repository;

import com.myRetail.assessment.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	RepoUtil util = new RepoUtil();

	@Override
	public Product getProductById(String id) {
		Product product = new Product();
		product.setID(id);
		Product productFromDB = util.mapper().load(product);
		
		return productFromDB;
	}

	@Override
	public void updateProduct(Product product) {
		Product productFromDb = util.mapper().load(product);
		productFromDb = product;
		util.mapper().save(productFromDb);
	}	

	@Override
	public Product createProduct( Product product) {
		util.mapper().save(product);
		return product;
	}

	@Override
	public void deleteProduct(String id) {
		Product product = new Product();
		product.setID(id);
		
		util.mapper().delete(product);

	}

}
