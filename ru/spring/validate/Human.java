package ru.afanasev.lessonsem2.spring.validate;

import org.springframework.stereotype.Component;

//@Avalidate()
//@Validate({TestName.class})
@Component
@Validate("testAge")
public class Human {
    private int age=4;
    private  String name;


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "height=" + age +
                "name"+name+
                '}';
    }
}
