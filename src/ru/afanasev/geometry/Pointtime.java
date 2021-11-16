package ru.afanasev.geometry;

import ru.afanasev.time.Time;

class Pointtime extends Abspoint {
    private Time time;


    public Pointtime(Time time,int...coords){
        super(coords);
        this.time=time;
    }

    public Time getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Точка в координатах " +super.toString()+
                "в " + time;
    }
}
