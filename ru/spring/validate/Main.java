package ru.afanasev.lessonsem2.spring.validate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.afanasev.lessonsem2.spring.cache.Sun;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {



        ApplicationContext ctx =
                new AnnotationConfigApplicationContext("ru.afanasev.lessonsem2.spring.cache");


         Sun s = (Sun)ctx.getBean("sun");
        System.out.println(s.mass());
        System.out.println( s.mass());
        System.out.println(s.mainQ());
     System.out.println(s.mainQ());
     System.out.println(s.mainQ());


        s.setMass(1);
        System.out.println( s.mass());
        System.out.println( s.mass());
        /// не совсем рабочее после
        System.out.println(s.mainQ());
        /* s.setMass(4);
         s.mass();*/
    }
}
