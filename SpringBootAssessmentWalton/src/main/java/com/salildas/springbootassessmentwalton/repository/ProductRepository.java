package com.salildas.springbootassessmentwalton.repository;

import com.salildas.springbootassessmentwalton.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByProductName(String ProductName);
}
