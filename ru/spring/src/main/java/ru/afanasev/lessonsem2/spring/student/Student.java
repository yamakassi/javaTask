/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Афанасьев_ИС
 */
public class Student {
  

    String name;

    List<Integer> grades;
    
    Predicate<Integer> predicate;

    Student(String name, List<Integer> lst, Predicate<Integer> rule) {
        this.name=name;
        this.grades=lst;
        this.predicate=rule;
    }

   
    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", grades=" + grades +
               // "bot:" + botans +"  "+
                ", predicate=" + predicate +
                '}';
    }
}

