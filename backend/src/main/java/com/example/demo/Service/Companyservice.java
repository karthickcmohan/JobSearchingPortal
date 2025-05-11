package com.example.demo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Company;
import com.example.demo.Repository.Companyrepository;

@Service
public class Companyservice {

    @Autowired
    private Companyrepository companyrepository;

    public Company findByEmailAndPassword(String email, String password) {
        return companyrepository.findByEmailAndPassword(email, password);
    }

    public Company saveCompany(Company company) {
        return companyrepository.save(company);
    }
}
