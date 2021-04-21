package com.cognizant.udemy.skillup.assignment.repositories;

import com.cognizant.udemy.skillup.assignment.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRespository extends JpaRepository<Student, Long> {
}
