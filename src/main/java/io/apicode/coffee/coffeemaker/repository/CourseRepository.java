package io.apicode.coffee.coffeemaker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.apicode.coffee.coffeemaker.model.Course;

public interface CourseRepository extends JpaRepository<Course, String> {
} 
