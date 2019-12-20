package com.rest.student.service.abstraction;

import com.rest.student.model.Course;
import com.rest.student.model.Student;

import java.util.List;

public interface IStudentService {

    List<Student> retrieveAllStudents();

    Student retrieveStudent(int studentId);

    List<Course> retrieveCourses(int studentId);

    Course retrieveCourse(int studentId, int courseId);

    Course addCourse(int studentId, String name);


}
