package ru.afanasev.geometry;

public abstract class Figure {
    Point start;

   public Figure(Point point){
        this.start=point;
    }

    public abstract int square();
}
