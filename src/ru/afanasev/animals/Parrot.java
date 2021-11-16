package ru.afanasev.animals;
class Parrot extends Bird{
    String textSong;
    public  Parrot(String name,String textSong){
        super(name);
        this.textSong=textSong;
    }

     @Override
     public void song() {
         System.out.println(textSong);
     }

     @Override
     public String toString() {
         return "Parrot{" +
                 "Name"+this.getName()+
                 "textSong='" + textSong + '\'' +
                 '}';
     }
 }
