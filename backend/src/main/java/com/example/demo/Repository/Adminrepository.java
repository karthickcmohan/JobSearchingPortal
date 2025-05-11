package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Admin;


@Repository
public interface Adminrepository extends JpaRepository<Admin, Long> {
    Admin findByEmailAndPassword(String email, String password);
}
