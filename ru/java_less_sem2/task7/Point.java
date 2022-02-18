package task7;

import java.util.Objects;

public class Point implements  Cloneable{
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }





    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }


    public Point clone()  {
        return new Point(this.x, this.y);
    }

    public  double distancetoEnd(Point end){
        return Math.sqrt((end.getX() - getX()) * (end.getX() - getX()) + (end.getY() - getY()) * (end.getY() - getY()));
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }




    public String toString() {
        return "{" + x + ';' + y + '}';
    }
}
