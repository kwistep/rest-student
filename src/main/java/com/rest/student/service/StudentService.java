package com.rest.student.service;

import com.rest.student.model.Course;
import com.rest.student.model.Student;
import com.rest.student.service.abstraction.IStudentService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService implements IStudentService {

    private List<Student> students = Arrays.asList(
            new Student(1, "Anton"),
            new Student(2, "Bohdan"));



    @Override
    public List<Student> retrieveAllStudents()
    {
        return students;
    }

    @Override
    public Student retrieveStudent(int studentId) {
        return students.get(studentId);
    }

    @Override
    public List<Course> retrieveCourses(int studentId) {
        return students.get(studentId).getCourses();
    }

    @Override
    public Course retrieveCourse(int studentId, int courseId) {
        return students.get(studentId).getCourses().get(courseId);
    }

    @Override
    public Course addCourse(int studentId, String name) {
        students.get(studentId).getCourses().add(new Course(students.get(studentId).getCourses().size(), name));
        return students.get(studentId).getCourses().get(students.get(studentId).getCourses().size()-1);
    }


}
