package org.bytetech;

public class Alien {

    private Computer comp;

//    public Alien(Computer comp) {
//        this.comp = comp;
//    }

    public void code() {
        System.out.println("Coding..");
        comp.compile();
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
}
