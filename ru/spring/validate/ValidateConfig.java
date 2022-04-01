package ru.afanasev.lessonsem2.spring.validate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;
import java.util.function.Predicate;

@Configuration
public class ValidateConfig {


    /*@Bean @Scope("prototype")
   public void testAge() throws ValidateException {


        if (h.getAge() < 1 ||
                h.getAge() > 120
        ) {
            System.out.println("GG");
            throw new ValidateException("возраст человека не в диапазоне от 1 до 200");
        }
    }*/

    @Bean @Scope("prototype")
    Predicate<Integer> testAge(){
        return x->x>=18&&x<=115;
    }
}

