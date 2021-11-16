package ru.afanasev.geometry;
import java.util.Arrays;


public class Abspoint  {
    private int[] coord;


    public Abspoint(int...coords){
        if(coords.length<=0 || coords.length>3) throw new IllegalArgumentException("Передано не правильно кол-во координат, можно передать одну,две или три");
        coord=new int[coords.length];
        System.out.println(coord.length);
        if(coords.length==1) coord[0]=coords[0];
        if(coords.length==2) {
            coord[0]=coords[0];
            coord[1]=coords[1];
        }
        if(coords.length==3) {
            coord[0]=coords[0];
            coord[1]=coords[1];
            coord[2]=coords[2];
        }


    }

    public int[] coords() {
        return Arrays.copyOf(coord,coord.length);
    }





    public String toString() {
        String str="";
        if(coord.length==1) str+="{"+coord[0]+"} ";
        if(coord.length==2) str+="{"+coord[0]+","+coord[1]+"} ";
        if(coord.length==3)  str+="{"+coord[0]+","+coord[1]+","+coord[2]+"} ";
        return "Точка в координате "+str;
    }
}
