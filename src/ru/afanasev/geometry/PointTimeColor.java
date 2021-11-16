package ru.afanasev.geometry;

import ru.afanasev.time.Time;

class PointTimeColor extends Pointcolor{
    private Time time;

    public PointTimeColor(Time time,String color,int...coords){
        super(color,coords);
        this.time=time;
    }
    public Time getTime() {
        return time;
    }
}
