package spring.student;

import java.util.function.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigStudent {
    @Bean
    Cat createCat(){
        return new Cat();
    }
    @Bean
    Predicate<Integer> predicate(){
        return x->x>=2&&x<=5;
    }
    @Bean
    Integer grade1(){
        return 5;
    }
    @Bean
    Integer grade2(){
        return 5;
    }
    @Bean
    Integer grade3(){
        return 8;
    }
    @Bean
    String name(){
        return "vasia";
    }
  
}
