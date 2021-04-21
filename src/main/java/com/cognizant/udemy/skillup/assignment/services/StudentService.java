package com.cognizant.udemy.skillup.assignment.services;

import com.cognizant.udemy.skillup.assignment.entities.Student;
import com.cognizant.udemy.skillup.assignment.repositories.StudentRespository;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService{

    StudentRespository studentRespository;
    public StudentService(StudentRespository studentRespository){
        this.studentRespository = studentRespository;
    }
    @Override
    public Student save(Student student) {
        return studentRespository.save(student);
    }

    @Override
    public void deleteById(long id) {

        studentRespository.deleteById(id);
    }

    @Override
    public Student getStudentById(long id) {
        return studentRespository.findById(id).get();
    }
}
