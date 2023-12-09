package com.elasriabdelillah.marjaneconfiguration.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "text")
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    private Date start_date;

    @Temporal(TemporalType.TIMESTAMP)
    private Date end_date;

    @Column(nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private PromotionCategory category;

    @ManyToOne
    @JoinColumn(name = "center_id")
    private Center center;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private CenterAdmin admin;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
