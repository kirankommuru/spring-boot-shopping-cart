package com.test.util.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.product.domain.Product;
import com.test.product.repository.ProductRepository;

@CrossOrigin
@RestController
@RequestMapping("/products")
public class ProductController {

	 @Autowired
	    private ProductRepository productRepository;

	    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
	    public List<Product> getAll(){
	        return productRepository.findAll();
	    
	    }
}
