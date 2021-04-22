package com.cognizant.udemy.skillup.assignment.controllers;

import com.cognizant.udemy.skillup.assignment.entities.Student;
import com.cognizant.udemy.skillup.assignment.repositories.StudentRespository;
import com.cognizant.udemy.skillup.assignment.services.IStudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final IStudentService studentService;


    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable long id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return studentService.save(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        return studentService.save(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudentd(@PathVariable long id){
        studentService.deleteById(id);
    }
}
