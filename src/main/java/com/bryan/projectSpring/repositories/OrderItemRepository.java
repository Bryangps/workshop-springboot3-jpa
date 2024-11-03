package com.bryan.projectSpring.repositories;

import com.bryan.projectSpring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
