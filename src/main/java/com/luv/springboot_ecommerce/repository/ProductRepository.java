package com.luv.springboot_ecommerce.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv.springboot_ecommerce.model.Product;

@CrossOrigin("http://localhost:4200")
// @RepositoryRestResource(collectionResourceRel = "products", path="products") //colletionResourceRel = oq vem no json, path = oq vem na url ex: localhost:8080/api/products
public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);

    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
}
