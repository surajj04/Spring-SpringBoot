package com.tech.springBootFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("21")
    private int age;

//    @Autowired
//    Laptop laptop;

    private Computer comp;

//    public Alien() {
//        System.out.println("Object is created..");
//    }

    public void code() {
        comp.compile();
    }

    @Autowired
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
