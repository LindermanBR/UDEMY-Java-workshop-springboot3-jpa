package com.requiemdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.requiemdev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
