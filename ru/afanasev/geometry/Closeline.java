package ru.afanasev.geometry;

import java.util.ArrayList;

public class Closeline extends Polyline {



    Closeline(Point...points) {
        super(points);
    }
    public double fullLine(){
        double fullLong = super.fullLine();
        ArrayList<Point> arrpoint=getPoints();

        fullLong += Math.hypot(arrpoint.get(0).getX()-arrpoint.get(arrpoint.size()-1).getX(),arrpoint.get(0).getY()-arrpoint.get(arrpoint.size()-1).getY());
                  return fullLong;
    }
}
