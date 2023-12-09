package com.elasriabdelillah.marjaneconfiguration.entities;

import jakarta.persistence.*;

@Entity
public class DepartmentManager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "center_id")
    private Center center;
}
