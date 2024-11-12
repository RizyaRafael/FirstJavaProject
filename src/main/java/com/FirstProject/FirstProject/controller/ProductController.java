package com.FirstProject.FirstProject.controller;

import com.FirstProject.FirstProject.model.Product;
import com.FirstProject.FirstProject.service.ProductService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Log
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/{productId}")
    public Optional<Product> getProductById(@PathVariable int productId){
        return service.getProductById(productId);
    }

    @GetMapping("/search")
    public Optional<List<Product>> getProductByName(@RequestParam(value = "prodName") String prodName){
        log.info("Product name variable: "+prodName);
        return service.getProductByName(prodName);
    }

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product prod){
        log.info("this is the body: " + prod.toString());
        return null;
    }
}
