package org.bytetech;


import org.bytetech.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        using .class
//        Laptop lap = context.getBean(Laptop.class);

//        using name
//        by default the name is method name
//        Laptop lap = (Laptop) context.getBean("laptop");
//        lap.compile();
//        Laptop lap2 = (Laptop) context.getBean("laptop");
//        lap2.compile();

        Alien a = context.getBean(Alien.class);
        a.code();
        System.out.println(a.getAge());



    }
}
