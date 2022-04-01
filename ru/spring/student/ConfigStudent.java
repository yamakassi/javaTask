package ru.afanasev.lessonsem2.spring.student;

import java.util.function.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigStudent {

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
