package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.JobApplication;
import com.example.demo.Service.JobApplicationservice;


@RestController
@RequestMapping("/api/job-applications")
public class JobApplicationcontroller {

    private final JobApplicationservice jobApplicationservice;

    @Autowired
    public JobApplicationcontroller(JobApplicationservice jobApplicationService) {
        this.jobApplicationservice = jobApplicationService;
    }

    @PostMapping
    public ResponseEntity<JobApplication> submitJobApplication(@RequestBody JobApplication jobApplication) {
        JobApplication savedJobApplication = jobApplicationservice.saveJobApplication(jobApplication);
        return ResponseEntity.ok(savedJobApplication);
    }

    @GetMapping("/listings")
    public ResponseEntity<List<JobApplication>> getAllJobListings() {
        List<JobApplication> jobListings = jobApplicationservice.getAllJobListings();
        return ResponseEntity.ok(jobListings);
   }
}