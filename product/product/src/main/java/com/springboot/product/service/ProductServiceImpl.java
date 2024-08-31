package com.springboot.product.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.springboot.product.entity.Product;
import com.springboot.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository productRepository;
//we have to provide the implementation for unimplemented methods of service interface 
	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	

	@Override
	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).orElse(null);
		}

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
	}

	@Override
	public Product updateProduct(Long id, Product product) {
		// TODO Auto-generated method stub
		if(productRepository.existsById(id)) {
			product.setId(id);
			return productRepository.save(product);
		}
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
	

	/*
	 * @Cacheable("productPrices") public Product getProductPrice(String productId)
	 * { return ; }
	 */
}
