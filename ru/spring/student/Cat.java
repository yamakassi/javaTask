package ru.afanasev.lessonsem2.spring.student;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    @Default
     String name;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
