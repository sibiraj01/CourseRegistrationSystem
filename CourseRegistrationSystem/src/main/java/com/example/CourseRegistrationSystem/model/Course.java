package com.example.CourseRegistrationSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

   @Id
    private String courseId;
    private String courseName;
    private String trainer;
    private int DurationInWeeks;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public int getDurationInWeeks() {
        return DurationInWeeks;
    }

    public void setDurationInWeeks(int durationInWeeks) {
        DurationInWeeks = durationInWeeks;
    }

    public Course(String courseId, String courseName, String trainer, int durationInWeeks) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.trainer = trainer;
        DurationInWeeks = durationInWeeks;
    }

    public Course() {
        // Default constructor
    }
}
