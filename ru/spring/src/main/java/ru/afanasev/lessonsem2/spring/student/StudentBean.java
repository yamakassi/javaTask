package ru.afanasev.lessonsem2.spring.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
public class StudentBean {
   public static List<StudentBean> botans = new ArrayList<>();

    String name;

    List<Integer> grades= new ArrayList<>();;

    Predicate<Integer> predicate;

    @Autowired
    StudentBean(Predicate<Integer> predicate, List<Integer> grad) {
        this.predicate = predicate;

       for (Integer i : grad) {


              if(predicate.test(i)==true) this.grades.add(i);

        }

    }

    @PostConstruct
    public void init() {
       if(isBotan()==true) botans.add(this);

    }
    boolean isBotan(){
       for (Integer i: grades){
           if(i!=5) return false;
       }
       return  true;
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
