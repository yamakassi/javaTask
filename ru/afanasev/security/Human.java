/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.afanasev.security;

/**
 *
 * @author Афанасьев_ИС
 */
public class Human {
    private String name;
    private int age;
    private int height;
    public Human(String name,int age,int height){
        this.name=name;
        this.age=age;
        this.height=height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return this.name+" "+this.age+" "+this.height;
    }
}
