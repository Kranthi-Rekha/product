package com.springboot.product.service;

import java.util.List;

import com.springboot.product.entity.Product;

public interface ProductService {
	//what are the actions we have to do that will be declare here
	Product createProduct(Product product);
	List<Product> getAllProducts();
	Product getProductById(Long id);
	void deleteProduct(Long id) ;
	Product updateProduct(Long id, Product product);
	//List<Product> getAllProducts(Pageable pageable);
	

}
