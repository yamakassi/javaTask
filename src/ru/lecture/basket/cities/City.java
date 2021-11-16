package ru.lecture.basket.cities;
import java.util.ArrayList;

public class City {
   private String name;
   private ArrayList<Way> arrWay = new ArrayList<>();


    public City(String name, Way... ways) {
        this.name = name;
        for (Way way : ways) this.arrWay.add(way);
    }

    public void addWay(City city, int price) {

        addWay(new Way(city, price));
    }

    public void addWay(Way way) {
        for (Way away : arrWay) {
            if (away == way && away.getPrice()==way.getPrice()) {
                throw new IllegalArgumentException(" Такой путь есть");

            }
        }
        arrWay.add(way);
    }

    public ArrayList<Way> getArrWay() {
        ArrayList<Way> tmp = new ArrayList<Way>();
        tmp.addAll(0, arrWay);
        return tmp;
    }

    public String getName() {
        return name;
    }

    public void delWay(Way way) {
        for (Way away : arrWay) {
            if (away == way) {
                arrWay.remove(away);
            }
        }
    }


        public String toString () {
            String str = "";
            for (Way way : arrWay) str += way + "\n";
            return "Пути отправления из " + name + " \n" + str;
        }
    }
