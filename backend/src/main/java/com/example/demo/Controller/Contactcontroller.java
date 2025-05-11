package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.Contact;
import com.example.demo.Service.Contactservice;


@RestController
@RequestMapping("/api/contacts")
public class Contactcontroller {

    @Autowired
    private Contactservice contactservice;

    @PostMapping("/submit")
    public Contact submitContact(@RequestBody Contact contact) {
        return contactservice.saveContact(contact);
    }
}