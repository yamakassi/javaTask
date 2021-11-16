package ru.lecture.basket.cities;


public class Way {
    private int price;
    final City city;

    public Way(City city, int price) {
        this.city = city;
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return city.getName() + ":" + price;
    }
}
