package com.bilgeadam.first_data_project.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "categories")
public class Category implements Serializable {

    @Id
    @Column(name = "category_id")
    private Integer id;

    @Column(name = "category_name")
    private String name;

    @Column
    private String description;

    @Column
    private byte[] picture;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "category_id: " + this.id + " category_name: " + this.name + " description: " + this.description+"\n";
    }
}
