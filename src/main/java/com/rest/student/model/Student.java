package com.rest.student.model;

import java.util.Arrays;
import java.util.List;

public class Student {

    private int id;

    private String name;

    private List<Course> courses;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = Arrays.asList(
                new Course(0, "CMNS"),
                new Course(1, "BUES")
        );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
