package com.tech.SpringBootFirst.mode;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Laptop implements Computer {

    @Override
    public void compile() {
        System.out.println("Code compile in laptop..");
    }
}
