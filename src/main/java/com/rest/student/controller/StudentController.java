package com.rest.student.controller;

import com.rest.student.model.Course;
import com.rest.student.model.Student;
import com.rest.student.service.abstraction.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
public class StudentController {

    @Autowired
    IStudentService studentService;

    @GetMapping("/students")
    ResponseEntity<List<Student>> getAllStudents()
    {
        return ResponseEntity.ok(studentService.retrieveAllStudents());
    }

    @GetMapping("/students/{studentId}")
    ResponseEntity<Student> getStudent(@PathVariable int studentId)
    {
        return ResponseEntity.ok(studentService.retrieveStudent(studentId));
    }

    @GetMapping("/students/{studentId}/courses")
    ResponseEntity<List<Course>> getAllCoursesOfStudent(@PathVariable int studentId)
    {
        return ResponseEntity.ok(studentService.retrieveStudent(studentId).getCourses());
    }

    @GetMapping("/students/{studentId}/courses/{courseId}")
    ResponseEntity<Course> getCourseOfStudent(@PathVariable int studentId,
                                              @PathVariable int courseId)
    {
        return ResponseEntity.ok(studentService.retrieveCourse(studentId, courseId));
    }

}
