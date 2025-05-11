package com.example.demo.Controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Admin;
import com.example.demo.Service.Adminservice;



@RestController
@RequestMapping("/api/auth/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class Admincontroller {

    @Autowired
    private Adminservice adminservice;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody Map<String, Object> signupData) {
        String email = (String) signupData.get("email");
        String password = (String) signupData.get("password");

        Admin admin = new Admin();
        admin.setEmail(email);
        admin.setPassword(password);
        adminservice.saveAdmin(admin);
        return ResponseEntity.ok("Admin registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> loginData) {
        String email = loginData.get("username");
        String password = loginData.get("password");

        Admin admin = adminservice.findByEmailAndPassword(email, password);
        if (admin != null) {
            return ResponseEntity.ok("Login successful");
        }

        return ResponseEntity.status(401).body("Invalid credentials");
    }
}