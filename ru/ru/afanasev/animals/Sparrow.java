package ru.afanasev.animals;
public class Sparrow extends Bird  {

   public Sparrow(String name){
        super(name);
    }

     @Override
     public void song() {
         System.out.println("Чырык");
     }

     @Override
     public String toString() {
         return "Птица "+this.getName()+", Издаёт звук: чырык";
     }
 }
