package com.youcode.marjan.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_general_admin")
public class GeneralAdmin extends BaseUser{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Getters and setters
    @Override
    public Long getId() {
        return this.id;
    }
    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
