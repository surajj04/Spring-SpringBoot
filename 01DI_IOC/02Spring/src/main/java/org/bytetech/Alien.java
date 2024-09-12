package org.bytetech;

public class Alien {

    private int age;
    private Laptop laptop;

    public Alien() {
        System.out.println("Object Created..");
    }

    public Alien(int age) {
        this.age = age;
    }



    public void code() {
        System.out.println("Coding...");
        laptop.compile();
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("setter called..");
        this.age = age;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
