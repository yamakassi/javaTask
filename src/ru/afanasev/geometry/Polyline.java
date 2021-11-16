package ru.afanasev.geometry;
import java.util.ArrayList;
import java.util.Arrays;

public class Polyline implements  Measurable,MultiLine{
    String str;
    private ArrayList<Point> points = new ArrayList<>();

   /* Polyline(int startX, int startY, int endX, int endY) {

        this(new Point(startX, startY), new Point(endX, endY));
    }*/

    public Polyline(Point... points) {
        for (Point point : points) this.points.add(point);
    }

    public Polyline(ArrayList<Point> arrpoints) {
        this.points= new ArrayList<>(arrpoints);
    }

    public void addPoint(Point... points) {
        for (Point point : points) this.points.add(point);
    }

    public double longfromStartTofinish() {
        return longLine(points.get(0), points.get(points.size() - 1));

    }

    public ArrayList<Point> getPoints() {

        return new ArrayList<Point>(points);
    }

    public double fullLine() {
        double fullLong = 0.0;
        int i = 0;
        while (i < points.size() - 1) {

            fullLong = fullLong + longLine(points.get(i), points.get(++i));

        }
        return fullLong;
    }

    protected double longLine(Point start, Point end) {
        return Math.sqrt((end.getX() - start.getX()) * (end.getX() - start.getX()) + (end.getY() - start.getY()) * (end.getY() - start.getY()));


    }

    public String toString() {
        String str = "";
        for (Point point : points) str += point;
        return "линия" + str;
    }

    @Override
    public Polyline toPolyline() {
        return this;
    }
}
