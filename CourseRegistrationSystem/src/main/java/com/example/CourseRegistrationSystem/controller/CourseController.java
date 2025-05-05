package com.example.CourseRegistrationSystem.controller;

import com.example.CourseRegistrationSystem.model.Course;
import com.example.CourseRegistrationSystem.model.CourseRegistry;
import com.example.CourseRegistrationSystem.repository.CourseRegistryrepo;
import com.example.CourseRegistrationSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/course")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

   @GetMapping("/course/enrolled")
    public List<CourseRegistry> getEnrolledCourses() {
        return courseService.getEnrolledCourses();
    }

   @PostMapping("/course/register")
    public String registerCourse(@RequestParam("name") String name,
                                 @RequestParam("emailId") String emailId,
                                 @RequestParam ("courseName")String courseName){
       courseService.registerCourse(name, emailId, courseName);
       return "Congratulations!"+name+ " You have successfully registered for the course."+courseName;

    }

}
