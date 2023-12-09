package com.elasriabdelillah.marjaneconfiguration.entities;

import jakarta.persistence.*;

@Entity
public class PromotionCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double maxDiscount;
}
