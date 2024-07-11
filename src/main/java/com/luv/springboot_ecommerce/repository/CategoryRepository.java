package com.luv.springboot_ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.luv.springboot_ecommerce.model.Category;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "category", path="categories")
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
