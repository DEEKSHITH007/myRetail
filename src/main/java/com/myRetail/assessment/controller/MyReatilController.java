package com.myRetail.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myRetail.assessment.model.Product;
import com.myRetail.assessment.service.ProductService;

@RestController
@RequestMapping("/product/")
public class MyReatilController {

	@Autowired
	private ProductService productService;

	@GetMapping("get/{id}")
	public Product getProductById(@PathVariable String id) {
		return productService.getProductById(id);
	}

	@PutMapping("update")
	public void updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
	}

	@PostMapping("create")
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}

	@DeleteMapping("delete/{id}")
	public void deleteMapping(@PathVariable String id) {
		productService.deleteProduct(id);
	}
}
