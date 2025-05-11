package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Admin;
import com.example.demo.Repository.Adminrepository;

@Service
public class Adminservice {

    @Autowired
    private Adminrepository adminrepository;

    public Admin findByEmailAndPassword(String email, String password) {
        return adminrepository.findByEmailAndPassword(email, password);
    }

    public Admin saveAdmin(Admin admin) {
        return adminrepository.save(admin);
    }
}
