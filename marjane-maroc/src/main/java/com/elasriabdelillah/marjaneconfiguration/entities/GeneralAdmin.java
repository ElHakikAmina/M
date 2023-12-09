package com.elasriabdelillah.marjaneconfiguration.entities;

import jakarta.persistence.*;

@Entity
public class GeneralAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;
}
