package com.shopping.productservice.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import com.shopping.productservice.dto.*;
import com.shopping.productservice.service.ProductService;

 
@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productservice;
    Logger log = LoggerFactory.getLogger(ProductController.class);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest)
    {   
        productservice.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        long startTime = System.currentTimeMillis();
        List<ProductResponse> allProducts = productservice.getAllProducts();
        long endTime = System.currentTimeMillis();

        log.info("Time taken to get products : " + (endTime - startTime));
        log.info("Product data size : " + allProducts.size() + "ms.");
        return allProducts;
    } 
}
