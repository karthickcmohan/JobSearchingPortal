package com.example.demo.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Company;
import com.example.demo.Service.Companyservice;



@RestController
@RequestMapping("/api/auth/company")
@CrossOrigin(origins = "http://localhost:3000")
public class Companycontroller {

    @Autowired
    private Companyservice companyservice;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody Map<String, Object> signupData) {
        String email = (String) signupData.get("email");
        String password = (String) signupData.get("password");

        Company company = new Company();
        company.setEmail(email);
        company.setPassword(password);
        company.setCompanyName((String) signupData.get("companyName"));
        company.setCompanyLogo((String) signupData.get("companyLogo"));
        companyservice.saveCompany(company);
        return ResponseEntity.ok("Company registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> loginData) {
        String email = loginData.get("username");
        String password = loginData.get("password");

        Company company = companyservice.findByEmailAndPassword(email, password);
        if (company != null) {
            return ResponseEntity.ok("Login successful");
        }

        return ResponseEntity.status(401).body("Invalid credentials");
   }
}
