package ru.afanasev.number;

import java.util.Arrays;

public class StaticMass<T> {
    private  T[] mass;
    private int count;
 public StaticMass(T...elements){
     mass= Arrays.copyOf(elements,elements.length);
     this.count=elements.length;

 }
}
