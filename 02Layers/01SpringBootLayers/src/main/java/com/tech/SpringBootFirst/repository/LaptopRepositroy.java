package com.tech.SpringBootFirst.repository;

import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepositroy {
    public void save() {
        System.out.println("Laptop added...");
    }
}
