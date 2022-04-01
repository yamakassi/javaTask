package ru.afanasev.lessonsem2.spring.cache;

import org.springframework.stereotype.Component;

@Component @Cache({})
public class Sun {
    private int mass=10;

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int mass() {
        System.out.println("original method");
        return mass;
    }
    public  int mainQ(){
        System.out.println("42 original");
        return 42;
    }
}
