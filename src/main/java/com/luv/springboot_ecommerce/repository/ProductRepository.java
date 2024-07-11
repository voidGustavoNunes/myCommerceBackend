package com.luv.springboot_ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.luv.springboot_ecommerce.model.Product;

@RepositoryRestResource(collectionResourceRel = "product", path="products")
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
