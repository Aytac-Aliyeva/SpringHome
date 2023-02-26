package com.example.springhome.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private Long id;

    @Column(name = "Telebeninadi", length = 50, nullable = false, unique = false)
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "Telebeninsoyadi", length = 50, nullable = false, unique = false)
    public Long getId() {
        return id;
    }
}
