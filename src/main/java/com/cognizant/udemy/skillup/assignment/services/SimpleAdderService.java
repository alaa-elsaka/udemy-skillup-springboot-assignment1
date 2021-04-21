package com.cognizant.udemy.skillup.assignment.services;

import org.springframework.stereotype.Service;

@Service
public class SimpleAdderService implements IAdderService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
