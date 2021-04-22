package com.cognizant.udemy.skillup.assignment.healthchecks;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CustomInfoControbutor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {

        Map<String,Integer> details = new HashMap<>();
        details.put("First grade", 100);
        details.put("Also First grade", 100);

        builder.withDetail("Grades", details);
    }
}
