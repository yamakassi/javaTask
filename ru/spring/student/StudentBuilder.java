/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.afanasev.lessonsem2.spring.student;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Афанасьев_ИС
 */
@Component
public class StudentBuilder {
    @Autowired
    Predicate<Integer> rule;
    public Student getStudent(String st,List<Integer> lst){
        return new Student(st,lst,rule);
    }
   
    
}
