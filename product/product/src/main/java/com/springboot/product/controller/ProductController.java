package com.springboot.product.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.product.entity.Product;
import com.springboot.product.service.ProductPriceService;
import com.springboot.product.service.ProductServiceImpl;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductServiceImpl productServiceImpl;
	@Autowired
	private ProductPriceService productPriceService;
	
	//get details of all product http call
	@GetMapping("/")
	public List<Product> getAllProducts()
	{
		return productServiceImpl.getAllProducts();
	}
//http call for get the details of particular product
	@GetMapping("/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Long id){
		Product product=productServiceImpl.getProductById(id);
		if(product!=null)
		{
			return new ResponseEntity<>(product, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@PutMapping("/update-price/")
	public List<Product> updatePrice(){
		return productPriceService.updateProductPrices();
		 
	}
	
	
	//http call for insert the details of product
	@PostMapping("/")
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		
		return new ResponseEntity<>(productServiceImpl.createProduct(product), HttpStatus.CREATED);
	}
	
	//http call for update the details of product
	@PutMapping("/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product)
	{
		Product product1=productServiceImpl.updateProduct(id, product);
		if(product1!=null) {
			return new ResponseEntity<>(product1, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//http call for delete the product
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
		productServiceImpl.deleteProduct(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	
	
}
