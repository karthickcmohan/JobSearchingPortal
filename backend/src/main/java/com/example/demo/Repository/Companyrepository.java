package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Company;


public interface Companyrepository extends JpaRepository<Company, Long> {
    Company findByEmailAndPassword(String email, String password);
}