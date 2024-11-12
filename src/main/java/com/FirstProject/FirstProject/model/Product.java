package com.FirstProject.FirstProject.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "\"Products\"")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "\"productName\"")
    private String productName;
    private int price;
}
