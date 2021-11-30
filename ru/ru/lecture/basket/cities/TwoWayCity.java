package ru.lecture.basket.cities;

public class TwoWayCity extends City {

    public TwoWayCity(String name, Way... ways) {
        super(name, ways);
        for (Way way : ways) way.city.addWay(this, way.getPrice());
    }

    public void addWay(Way way) {
        super.addWay(way);
      for (Way returnWay : way.city.getArrWay()) {
            if (returnWay.city == this && returnWay.getPrice() == way.getPrice()) return;
        }
        way.city.addWay(new Way(this, way.getPrice()));

    }

}
