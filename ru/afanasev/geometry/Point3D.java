package ru.afanasev.geometry;

public class Point3D extends Point {
    private int z;

    private Point3D(Point3D p3D) {
        this(p3D.getX(), p3D.getY(), p3D.getZ());
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return super.toString() + "z:" + z;

    }


    @Override
    public double distancetoEnd(Point end) {
        return Math.sqrt((end.getX() - getX()) * (end.getX() - getX()) + (end.getY() - getY()) * (end.getY() - getY())+ Math.pow(((Point3D)end).z-this.z,2));
    }

    public Point clone() {
        return new Point3D(this);
    }


}
