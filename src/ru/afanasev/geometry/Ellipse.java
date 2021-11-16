package ru.afanasev.geometry;

class Ellipse  {
    Point point;
     int radius1;
     int radius2;

    private Ellipse(Point point,int r1,int r2){
        this.point=point;
        this.radius1=r1;
        this.radius2=r2;
    }
    public static Ellipse createEllipse(Point point,int r1,int r2){
        return new Ellipse(point,r1,r2);
    }
    public static Ellipse createCircle(Point point,int r1){
        return new Ellipse(point,r1,r1);
    }
    public boolean isCircle(){
        return  radius1==radius2;
    }




}
