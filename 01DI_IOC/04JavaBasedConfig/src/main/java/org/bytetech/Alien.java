package org.bytetech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("21")
    private int age;

    @Autowired
    private Computer comp;

    public Alien() {
        System.out.println("alien obj created..");
    }


    public void code() {
        System.out.println("Coding..");
        comp.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//        @Autowired
    public void setComp(Computer comp) {
        this.comp = comp;
    }
}
