package com.tech.springBootFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Autowired
    Laptop laptop;

//    public Alien() {
//        System.out.println("Object is created..");
//    }

    public void code() {
        laptop.compile();
    }
}
