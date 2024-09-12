package org.bytetech;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public Laptop() {
        System.out.println("laptop obj created..");
    }

    @Override
    public void compile() {
        System.out.println("Code Compile In Laptop..");
    }
}
