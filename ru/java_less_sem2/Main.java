package task7;


import task7.human.Human;
import task7.human.HumanTests;
import task7.human.Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    
    public static void main(String[] args) {
        //7.1.1
       /* B a = new B();
        System.out.println("ff");
        System.out.println(StatMetods.fieldCollection(a));
        //7.1.2
        Line<Point> l1 = new Line(new Point(3,2),new Point(3,10));
        Line<Point> l2 = new Line(new Point(0,0),new Point(12,22));
        StatMetods.lineConnector(l1,l2);
        System.out.println(l1+"\n"+l2);
*/
        // 7.3.4
        /*Human h = new Human(20,"A");
        System.out.println(h);
        StatMetods.validate(h);*/
        /*
        A a = new A();
        B b = new B();
       StatMetods.reset(b);
        System.out.println(b);*/
        
        ApplicationContext cont = new AnnotationConfigApplicationContext("task7");
        System.out.println(cont.getBeansOfType(Stuff.class).toString());
        
    }
}
