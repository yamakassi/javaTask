package spring.autowireTestExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;
@Configuration
@ComponentScan()
public class CollectionsConfig {
/*
    @Bean({"connection1","unconnected","sum"})
    @AnnotRun//@ServRunSЫ
    public BD getConnection1() {
        BD database = new BD("City");
        System.out.println("tututut");
        return database;
    }
    @Bean({"connection2"})
    public BD getConnection2() {
        BD database = new BD("City2");
        System.out.println("fgffggf");
        return database;
    }
/*
        @Bean
        public JbdBean jbdBean1(){
            JbdBean bean = new JbdBean();
            bean.setUuid(UUID.randomUUID().toString());
            return bean;
        }
        @Bean
        public JbdBean jbdBean2(){
            JbdBean bean = new JbdBean();
            System.out.println("tittiut");
            bean.setUuid(UUID.randomUUID().toString());
            return bean;
        }*/
    }

