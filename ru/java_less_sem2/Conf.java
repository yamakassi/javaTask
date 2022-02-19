/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Афанасьев_ИС
 */
@Configuration
public class Conf {
    @Bean
    public Stuff table(IDGenerator g){//generator  лучше бы интерфейсом
       return new Stuff(g.next(),"table");
    }
    @Bean
     public Stuff chair(IDGenerator g){
       return new Stuff(g.next(),"chair");
    }
     @Bean
      public Stuff pen(IDGenerator g){
       return new Stuff(g.next(),"pen");
    }
}
