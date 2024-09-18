package com.tech.SpringBootFirst.mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    private Computer comp;

    public void code() {
        comp.compile();
    }

}
