package com.cognizant.udemy.skillup.assignment.services;

import com.cognizant.udemy.skillup.assignment.entities.Student;

import java.util.List;

public interface IStudentService {
    Student save(Student student);

    void deleteById(long id);

    Student getStudentById(long id);


    List<Student> getAllStudents();
}
