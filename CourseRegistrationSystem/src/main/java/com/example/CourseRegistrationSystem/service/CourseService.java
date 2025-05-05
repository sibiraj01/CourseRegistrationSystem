package com.example.CourseRegistrationSystem.service;

import com.example.CourseRegistrationSystem.model.Course;
import com.example.CourseRegistrationSystem.model.CourseRegistry;
import com.example.CourseRegistrationSystem.repository.CourseRegistryrepo;
import com.example.CourseRegistrationSystem.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistryrepo courseRegistryrepo;

    public List<Course> getAllCourses() {
      return courseRepo.findAll();
    }

    public List<CourseRegistry> getEnrolledCourses() {
        return courseRegistryrepo.findAll();
    }

    public void registerCourse(String name, String emailId, String courseName) {

       CourseRegistry courseRegistry = new CourseRegistry(name, emailId, courseName);
        courseRegistryrepo.save(courseRegistry);
    }
}
