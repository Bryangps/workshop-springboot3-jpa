package com.bryan.projectSpring.repositories;

import com.bryan.projectSpring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
