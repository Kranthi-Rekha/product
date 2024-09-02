
 package com.products.springboot.service;
 
  import java.util.Arrays;

import java.util.List;
  
 import org.springframework.scheduling.annotation.Scheduled; 
 import org.springframework.stereotype.Service; 
 import org.springframework.web.client.RestTemplate;

import com.products.springboot.entity.Product;


 @Service 
 public class ProductPriceService { 
	 private final RestTemplate restTemplate = new RestTemplate();
  
  @Scheduled(fixedRate = 8640000) // 24 hours public List<Product>
  public List<Product> updateProductPrices() { 
	  String url ="https://localhost:9090/products/prices"; 
	  Product[] result =(Product[]) restTemplate.getForObject(url, Product[].class);
	  return Arrays.asList(result);
  
  }
 
 }
 