package com.cognizant.udemy.skillup.assignment.services;

import com.cognizant.udemy.skillup.assignment.entities.Student;

public interface IStudentService {
    Student save(Student student);

    void deleteById(long id);

    Student getStudentById(long id);


}
