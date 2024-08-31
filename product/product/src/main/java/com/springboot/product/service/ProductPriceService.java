package com.springboot.product.service;

import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.product.entity.Product;
@Service
public class ProductPriceService {
	private final RestTemplate restTemplate = new RestTemplate();

    @Scheduled(fixedRate = 86400000) // 24 hours
    public List<Product> updateProductPrices() {
        String url = "https://localhost:9090/products/prices";
        Product[] products = restTemplate.getForObject(url, Product[].class);
		return null;
        
    }

}
