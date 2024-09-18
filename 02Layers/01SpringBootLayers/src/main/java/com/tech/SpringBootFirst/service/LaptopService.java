package com.tech.SpringBootFirst.service;

import com.tech.SpringBootFirst.mode.Laptop;
import com.tech.SpringBootFirst.repository.LaptopRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    LaptopRepositroy repo;

    public void addLaptop(Laptop lap) {
        repo.save();
    }
}
