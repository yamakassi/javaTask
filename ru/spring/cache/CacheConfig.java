package ru.afanasev.lessonsem2.spring.cache;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class CacheConfig {
    @Bean
    Integer number42() {
        return 42;
    }
}
