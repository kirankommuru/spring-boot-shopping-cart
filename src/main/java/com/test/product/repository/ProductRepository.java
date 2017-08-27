package com.test.product.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.product.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
	public List<Product> findBycategory(String category);
	public Product findByName(String productName);
}