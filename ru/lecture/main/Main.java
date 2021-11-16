package ru.lecture.main;

public class Main {
    public static void main(String[] args) {

        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();
NutritionFacts c1 = cocaCola;
cocaCola=null;
        System.out.println(c1);
        System.out.println(cocaCola);
    }
}
