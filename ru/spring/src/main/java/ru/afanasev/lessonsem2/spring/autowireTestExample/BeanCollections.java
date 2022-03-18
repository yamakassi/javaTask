package ru.afanasev.lessonsem2.spring.autowireTestExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component("gg")
    public class BeanCollections {

    private final Map<String, BD> modServMap;
    @Autowired
    public BeanCollections(@AnnotRun Map<String,BD> modServMap) {
        this.modServMap = modServMap;
    }

    @Override
        public String toString() {

            System.out.println(modServMap);
            return "map" ;
        }
    }
