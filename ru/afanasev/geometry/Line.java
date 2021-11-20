package ru.afanasev.geometry;

import java.util.Objects;

public class Line<T extends Point> implements Measurable, MultiLine,Cloneable {

    private T start;
    private T end;

    public Line(T start, T end)  {
        if(start==null || end==null) throw new IllegalArgumentException("Point is not null");
        this.start =(T)  start.clone();//
        this.end =  (T) end.clone();//
    }
public  static Line<Point> create(int x1,int y1,int x2,int y2){
        return new Line<>(new Point(x1,y1), new Point(x2,y2));
}
    public T getEnd()  {
        return (T)this.end.clone();
    }

    public T getStart()  {
        return (T) this.start.clone();
    }

    public void setStart(Point startNew)  {
        this.start = (T) startNew.clone();
    }

    public void setEnd(T startEnd)  {
        T buf = (T) startEnd.clone();
        this.end =  buf;
    }
    public double length(){
        return start.distancetoEnd(end);
    }
    public double getDistance(){
      return  start.distancetoEnd(end);       
    }
   public void moveLine(Line l){
        if(start.getX()>0) start.setX(start.getX()+10);
        else start.setX(start.getX()-10);
    }

    public double fullLine() {

        return Math.sqrt((end.getX() - start.getX()) * (end.getX() - start.getX()) + (end.getY() - start.getY()) * (end.getY() - start.getY()));

    }
    @Override
    public Line clone()   {
        return new Line( start.clone(),  end.clone());
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return start.equals(line.start) && end.equals(line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    public String toString() {
        return "линия от " + start + " до " + end;
    }

    @Override
    public Polyline toPolyline() {
        return new Polyline(start, end);
    }
}
