package com.FirstProject.FirstProject.repository;

import com.FirstProject.FirstProject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    //this is for finding product by name
    @Query("SELECT p FROM Product p WHERE productName ILIKE %:name%")
    Optional<List<Product>> findByName(@Param("name") String name);
}
