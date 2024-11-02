package com.bryan.projectSpring.repositories;

import com.bryan.projectSpring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
