package com.cognizant.udemy.skillup.assignment.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private long id;
    private String name;
    private double testScore;

    public Student() {
    }

    public Student(String name, double testScore) {
        this.name = name;
        this.testScore = testScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }
}
