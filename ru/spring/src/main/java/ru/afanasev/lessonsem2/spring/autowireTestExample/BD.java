package ru.afanasev.lessonsem2.spring.autowireTestExample;

public class BD {
    String name;

    public BD(String name) {
        this.name = name;
    }

    public String connection(String nameTable){
        return "Connect";
    }


    @Override
    public String toString() {
        return "BD{" +
                "name='" + name + '\'' +
                '}';
    }
}