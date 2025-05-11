package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.JobApplication;


public interface JobApplicationrepository extends JpaRepository<JobApplication,Long>{
}