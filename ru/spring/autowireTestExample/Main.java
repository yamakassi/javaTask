package ru.afanasev.lessonsem2.spring.autowireTestExample;

import java.lang.reflect.Field;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.afanasev.lessonsem2.spring.student.Cat;
import ru.afanasev.lessonsem2.spring.student.ConfigStudent;


public class Main {
    public static void main(String[] args) {
      
       ApplicationContext aContext 
                = new AnnotationConfigApplicationContext("ru.afanasev.lessonsem2.spring.student");
        //BeanCollections beanReferCollections = (BeanCollections) aContext.getBean("gg");
        System.out.println(aContext.getBean(Cat.class));
          
       // System.out.println(StudentBean.botans);*/
    }
}

/*дз 
классы с кэшированием 
*/