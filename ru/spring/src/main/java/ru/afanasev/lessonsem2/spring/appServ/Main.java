package spring.appServ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.afanasev.lessonsem2.spring.autowireTestExample.BD;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
       // System.out.println(context.getBeansOfType(Stuff.class));
        System.out.println("------------------------------------------");
        String command1 = "sum/5,6,4,-2";

        Run run = (String strCom) -> {
            String com[] = strCom.split("/");
            String method = com[0];
            List<String> arg= Arrays.asList(com[1].split(","));
           return (String) context.getBean(method,arg);
        };

        System.out.println(run.get(command1));

    }
}
