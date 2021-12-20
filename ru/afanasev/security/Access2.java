package ru.afanasev.security;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Access2 {
    private List<Predicate<Human>> rules = new ArrayList<>();
    private  Access2 prev;
    //
    public Access2(List<Predicate<Human>> listPredic){
        this.rules=listPredic;
    }
    public  void addRule(Access2 a,List<Predicate<Human>> listPred){
    this.prev = a;
    this.rules.addAll(listPred);

    }

    public List<Predicate<Human>> getRules(){
        return new ArrayList<>(this.rules);
    }

    public  boolean check(Human h){
        for(Predicate<Human> rule:rules){
            if(rule.test(h)==false) return false;
        }


        if(prev != null)  prev.check(h);
        return true;

    }
}
