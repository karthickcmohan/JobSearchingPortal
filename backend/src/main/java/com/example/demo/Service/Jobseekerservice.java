package com.example.demo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Jobseeker;
import com.example.demo.Repository.Jobseekerrepository;

@Service
public class Jobseekerservice {

    @Autowired
    private Jobseekerrepository jobseekerrepository;

    public Jobseeker findByEmailAndPassword(String email, String password) {
        return jobseekerrepository.findByEmailAndPassword(email, password);
    }

    public Jobseeker saveJobSeeker(Jobseeker jobSeeker) {
        return jobseekerrepository.save(jobSeeker);
    }
}
