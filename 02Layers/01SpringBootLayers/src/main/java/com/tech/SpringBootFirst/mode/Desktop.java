package com.tech.SpringBootFirst.mode;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    @Override
    public void compile() {
        System.out.println("Code compile in desktop..");
    }
}
