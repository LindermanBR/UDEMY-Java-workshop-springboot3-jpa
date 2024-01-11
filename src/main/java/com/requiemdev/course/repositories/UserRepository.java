package com.requiemdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.requiemdev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
