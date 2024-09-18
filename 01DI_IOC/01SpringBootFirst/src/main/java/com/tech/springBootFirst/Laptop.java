package com.tech.springBootFirst;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile() {
        System.out.println("Code Compile In Laptop...");
    }
}
