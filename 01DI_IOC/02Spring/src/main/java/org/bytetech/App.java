package org.bytetech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj = (Alien) context.getBean("alien");
//        obj.code();
//        obj.setAge(21);
        System.out.println(obj.getAge());
        obj.code();

//        Alien obj1 = (Alien) context.getBean("alien");
//        obj1.code();
//        System.out.println(obj1.getAge());
    }
}
