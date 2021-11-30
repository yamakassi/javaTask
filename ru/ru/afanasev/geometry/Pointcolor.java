package ru.afanasev.geometry;

class Pointcolor extends Abspoint {
    private String color;

    public Pointcolor(String color,int...coords){
        super(coords);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Точка в координатах " +super.toString()+
                "," + color + "цвета";
    }

}
