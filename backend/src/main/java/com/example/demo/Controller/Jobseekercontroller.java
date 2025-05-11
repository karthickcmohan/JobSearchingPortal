package com.example.demo.Controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Jobseeker;
import com.example.demo.Service.Jobseekerservice;



@RestController
@RequestMapping("/api/auth/jobseeker")
@CrossOrigin(origins = "http://localhost:3000")

public class Jobseekercontroller {

    @Autowired
    private Jobseekerservice jobseekerservice;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody Map<String, Object> signupData) {
        String email = (String) signupData.get("email");
        String password = (String) signupData.get("password");

        Jobseeker jobSeeker = new Jobseeker();
        jobSeeker.setEmail(email);
        jobSeeker.setPassword(password);
        jobSeeker.setName((String) signupData.get("name"));
        jobSeeker.setDegree((String) signupData.get("degree"));
        jobSeeker.setCourse((String) signupData.get("course"));
        jobSeeker.setIsStudent((Boolean) signupData.get("isStudent"));
        jobSeeker.setExperience((Integer) signupData.get("experience"));
        jobSeeker.setResume((String) signupData.get("resume"));
        jobSeeker.setCity((String) signupData.get("city"));
        jobSeeker.setCountry((String) signupData.get("country"));
        jobseekerservice.saveJobSeeker(jobSeeker);
        return ResponseEntity.ok("Job Seeker registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> loginData) {
        String email = loginData.get("username");
        String password = loginData.get("password");

        Jobseeker jobSeeker = jobseekerservice.findByEmailAndPassword(email, password);
        if (jobSeeker != null) {
            return ResponseEntity.ok("Login successful");
        }

        return ResponseEntity.status(401).body("Invalid credentials");
    }
}