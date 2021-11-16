package ru.afanasev.animals;
public class Сuckoo extends Bird{



     public Сuckoo(String name) {
         super(name);
     }

     @Override
    public void song() {
         for(int i=0;i<Math.ceil(Math.random()*10);i++){
             System.out.println("ку-ку");
         }

     }
 }
