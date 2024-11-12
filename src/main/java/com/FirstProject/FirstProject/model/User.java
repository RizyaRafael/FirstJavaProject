package com.FirstProject.FirstProject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "\"Users\"")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String username;
}
