package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Contact;
import com.example.demo.Repository.Contactrepository;

@Service
public class Contactservice {

    @Autowired
    private Contactrepository contactrepository;

    public Contact saveContact(Contact contact) {
        return contactrepository.save(contact);
    }
}
