package com.example.CourseRegistrationSystem.repository;

import com.example.CourseRegistrationSystem.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryrepo extends JpaRepository<CourseRegistry, Integer> {
    // Custom query methods can be defined here if needed
}
