package ru.afanasev.geometry;

class Rectangle extends  Square implements MultiLine{
    private  int side2;
    public Rectangle(Point start, int side,int side2) {
        super(start, side);
        this.side2=side2;
    }


    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    @Override
    public int square() {
        return getSide()*getSide2();
    }

    @Override
    public Polyline toPolyline() {
        Point p1 = new Point(start.getX(), start.getY());
        Point p2 = new Point(p1.getX() + side2, p1.getY());
        Point p3 = new Point(p1.getX() + side2, p1.getY() - getSide());
        Point p4 = new Point(p1.getX(), p1.getY() - getSide());

        Polyline pl= new Closeline(p1, p2, p3, p4,p1);
        return pl;

    }
}
