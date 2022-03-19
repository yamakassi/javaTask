package spring.autowireTestExample;

import java.lang.reflect.Field;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.student.Cat;
import spring.student.StudentBean;
import tr.TrafficLight;

public class Main {
    public static void main(String[] args) {
      
       ApplicationContext aContext 
                = new AnnotationConfigApplicationContext("spring.student");
        //BeanCollections beanReferCollections = (BeanCollections) aContext.getBean("gg");
        System.out.println(aContext.getBean(Cat.class));
          
       // System.out.println(StudentBean.botans);*/
    }
}

/*дз 
классы с кэшированием 
*/