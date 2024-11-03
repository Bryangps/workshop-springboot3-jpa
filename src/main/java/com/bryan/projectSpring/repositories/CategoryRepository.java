package com.bryan.projectSpring.repositories;

import com.bryan.projectSpring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
