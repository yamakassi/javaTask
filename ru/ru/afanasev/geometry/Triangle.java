package ru.afanasev.geometry;

class Triangle extends Figure {
    private Point b;
    private Point c;
    public Triangle(Point a,Point b,Point c){
        super(a);
        this.b=b;
        this.c=c;
    }

     @Override
     public int square() {
         return (int)0.5*Math.abs(((b.getX()-start.getX())*(c.getY()-start.getY()))-(c.getX()-start.getX())*(b.getY()-start.getY()));
     }

     @Override
     public String toString() {
         return "Triangle{"
                 +super.toString()+
                 "b=" + b +
                 ", c=" + c +
                 '}';
     }
 }
