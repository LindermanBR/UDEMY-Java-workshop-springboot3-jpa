package com.requiemdev.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.requiemdev.course.entities.Category;
import com.requiemdev.course.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category fidById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
