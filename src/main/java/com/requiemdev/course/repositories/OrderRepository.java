package com.requiemdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.requiemdev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
