package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Jobseeker;


public interface Jobseekerrepository extends JpaRepository<Jobseeker, Long> {
    Jobseeker findByEmailAndPassword(String email, String password);
}
