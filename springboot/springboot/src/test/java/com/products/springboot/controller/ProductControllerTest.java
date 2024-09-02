package com.products.springboot.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.products.springboot.entity.Product;
import com.products.springboot.service.ProductService;

@ExtendWith(MockitoExtension.class)
public class ProductControllerTest {
	@InjectMocks
    private ProductController productController;

    @Mock
    private ProductService productService;

    @Test
    public void testGetProductById() {
        
        Optional<Product> product = Optional.ofNullable(new Product());
        when(productService.getProductById(anyLong())).thenReturn(product);
        Optional<Product> response = productController.getProductById(1L);

        // Assertions
        //assertEquals(HttpStatus.OK, response.getStatusCode());
        //assertNotNull(response.getBody());
    }

	

}
