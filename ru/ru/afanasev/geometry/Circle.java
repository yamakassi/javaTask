package ru.afanasev.geometry;

class Circle extends Figure {
    private int radius;

    public Circle(Point point,int rad){
        super(point);
        this.radius=rad;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int square() {
        return  (int)Math.round(radius*radius*Math.PI);

    }

    @Override
    public String toString() {
        return "Circle{" +
                "Start point " + start+
                "radius=" + radius +
                '}';
    }
}
