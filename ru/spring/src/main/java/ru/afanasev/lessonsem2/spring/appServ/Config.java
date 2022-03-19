package spring.appServ;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.afanasev.lessonsem2.spring.autowireTestExample.BD;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Configuration
public class Config {

    @Bean @Scope("prototype")
    public String sum(List<String> args) {
       return args.stream().map( x->Integer.valueOf((String) x)).reduce((x,y)->x+y).orElse(0).toString();
    }
    @Bean @Scope("prototype")
    public String multi(List<String> args) {
       return args.stream().map( x->Integer.valueOf((String) x)).reduce((x,y)->x*y).orElse(0).toString();
    }
/*
    @Bean @Scope("prototype")
    public String multi(String ...args) {
        return
    }
*/

}

