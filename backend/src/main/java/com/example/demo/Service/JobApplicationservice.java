package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.JobApplication;
import com.example.demo.Repository.JobApplicationrepository;

@Service
public class JobApplicationservice {

    private final JobApplicationrepository jobApplicationrepository;

    @Autowired
    public JobApplicationservice(JobApplicationrepository jobApplicationRepository) {
        this.jobApplicationrepository = jobApplicationRepository;
    }

    public JobApplication saveJobApplication(JobApplication jobApplication) {
        return jobApplicationrepository.save(jobApplication);
    }

    public List<JobApplication> getAllJobListings() {
        return jobApplicationrepository.findAll();
    }
}
