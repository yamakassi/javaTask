/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.afanasev.security;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Афанасьев_ИС
 */
public class Access {
   private List<Predicate<Human>> rules = new ArrayList<>();
    //
    public Access(List<Predicate<Human>> listPredic){
        this.rules=listPredic;
    }
    public static Access createAccess(Access a,List<Predicate<Human>> listPred){
     List<Predicate<Human>> nRules =new ArrayList<>(a.getRules());
        nRules.addAll(listPred);
        return new Access(nRules);
    }
    
    public List<Predicate<Human>> getRules(){
        return new ArrayList<>(this.rules);
    }
    
   public  boolean check(Human h){
      for(Predicate<Human> rule:rules){
          if(rule.test(h)==false) return false;
      }
       
       return true;
        
    }
}
