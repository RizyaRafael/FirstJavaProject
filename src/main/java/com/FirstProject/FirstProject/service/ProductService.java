package com.FirstProject.FirstProject.service;


import com.FirstProject.FirstProject.model.Product;
import com.FirstProject.FirstProject.repository.ProductRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Slf4j
@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Optional<Product> getProductById(int prodId) {
        return repo.findById(prodId);
    }

    public Optional<List<Product>> getProductByName(String prodName) {
    return repo.findByName(prodName);
    }

}