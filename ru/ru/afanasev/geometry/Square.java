package ru.afanasev.geometry;

 public class Square extends Figure implements MultiLine{

    private int side;


    public Square(Point start, int side) {
        super(start);
        if (side<=0) throw new IllegalArgumentException("is not a legal long side;");
        this.side = side;

    }
    public int getSide(){
        return  side;
    }
    public void setSide(int side){
        this.side=side;

    }

    public Polyline toPolyline() {
        Point p1 = new Point(start.getX(), start.getY());
        Point p2 = new Point(p1.getX() + side, p1.getY());
        Point p3 = new Point(p1.getX() + side, p1.getY() - side);
        Point p4 = new Point(p1.getX(), p1.getY() - side);

        Polyline pl= new Closeline(p1, p2, p3, p4,p1);
        return pl;
    }

     @Override
    public int square() {
         return side*side;
     }

     @Override
    public String toString() {
        return "Квадрад в точке " + start + "со стороной:" + side;
    }


 }
