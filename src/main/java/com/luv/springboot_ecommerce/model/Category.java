package com.luv.springboot_ecommerce.model;

import java.util.Set;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="category")
public class Category extends GenericModel{

    @Column(name="category_name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    Set<Product> products;

}
