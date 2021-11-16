package ru.afanasev.animals;
public abstract class Bird {
   private String name;

   public Bird(String name){
        this.name=name;

    }
    public abstract void song();

    public String getName() {
        return name;
    }
}
