package com.example.demo.Repository;


import com.example.demo.Entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {}
