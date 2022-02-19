package task7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import task7.annotation.Default;
import task7.annotation.Invoke;

//7.1.1

public class A extends Entity {

    int x = 77;
    //@Default("42")
    String txt = "hello world";

    // @Invoke
    void m1() {
        System.out.println(txt);
    }
    @Bean()
    Integer i() {
        return 42;
    }
    @Bean(name ="Test")
    String m() {
        return "M";
    }
    @Bean()
    A self() {
       return new A();
    }
}
