package com.requiemdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.requiemdev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
