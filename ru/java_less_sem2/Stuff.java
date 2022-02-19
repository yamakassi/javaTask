/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 *
 * @author Афанасьев_ИС
 */

public class Stuff {
    int id;
    String descriprion;
    public  Stuff(int id,String desc){
       this.id = id;
       this.descriprion=desc;
    }
    @Override
   public String toString(){
       return id + " " + descriprion;
   }
}
