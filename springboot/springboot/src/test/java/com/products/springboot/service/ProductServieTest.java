package com.products.springboot.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.products.springboot.entity.Product;
import com.products.springboot.repository.ProductRepository;
public class ProductServieTest {
	@InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateProduct() {
        Product product = new Product();
        when(productRepository.save(any())).thenReturn(product);
        Product savedProduct = productService.createProduct(product);

        // Assertions
        assertNotNull(savedProduct);
    }


}
