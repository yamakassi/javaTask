package ru.afanasev.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("qwe");
        strings.add("qfsdwe");
        strings.add("qwffsdfsdfe");
        strings.add(strings.size() - 1, "s");

        List<Number> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(-3);
        numberList.add(7);

        SumCharStrings sc = new SumCharStrings();
        System.out.println(StaticMetods.funcApply(strings, sc));

     /*  Student st1 = new Student("Vasia", 5,4,4);
        Student st2 = new Student("Petia", 5,4,5);


        System.out.println(st1.compareST(st2));

        List<String> strings = new ArrayList<>();
        strings.add("helloa");
        strings.add("12345a");
        strings.add("hello");
        ComparatorA c1 = new ComparatorA();
        System.out.println(strings);
        strings.sort(c1);
        System.out.println(strings);
*/

     /*   Box<Point> num = new Box<>();
        Box<Point3D> n1 = new Box<>();
        Box<Integer> n2 = new Box<>();

        StaticMetods.pointInBox(num);
        StaticMetods.pointInBox(n1);
        StaticMetods.pointInBox(n2);

        System.out.println(num);
        System.out.println(n1);
        System.out.println(n2);

/*
     Storage<Integer> st=new Storage<>(-4);
     Storage<Double> num2=new Storage<>(-2.0);
     Storage<Double> num3=new Storage<>(-77.0);
        System.out.println(StaticMetods.maxStorageNum(st,num2,num3));
        System.out.println(st.getOutOb());




      /*  Fraction fr1 = Fraction.createFraction(33, 66); //
        Fraction fr2 = Fraction.createFraction(1, 2); //
        System.out.println(fr1 == fr2);
        System.out.println(fr2);
        System.out.println(fr1);*/
/*
        Box<Integer> num = new Box<>();
        num.putInOb(3);
        System.out.println(num);
        //   num.putInOb(0);
        System.out.println(num.getOutOb());
        System.out.println(num);

//      Department dpIT =new Department("IT");
//        Employ el1= new Employ("IT", dpIT);
//
//        BigInteger bigNum = new BigInteger("12345678912345678912");
//        Fraction fr1 = new Fraction(11, 3);
//       // System.out.println(sum(7, fr1, 3.21, bigNum));
//
//        Point p1 = new Point(0, 5);
//        Point p2 = new Point(1, 8);
//        Point p3 = new Point(0, 77);
//        Point p4 = new Point(13, 8);
//        Polyline pl1 = new Polyline(p2, p3, p4);
//      //  System.out.println(pl1.getPoints());
//        Square sq1 = new Square(p1, 5);
//       // System.out.println(getPolyline(sq1, pl1));
//
//        java.awt.Point awtPoint = new java.awt.Point(3, 4);
//        System.out.println(p1);
//        System.out.println(awtPoint);

      /*
        BestShooter bs1 = new BestShooter("John");
        BestShooter bs2 = new BestShooter("Vasia");
        Gun vx1 = new Gun(4, 18);
        bs2.setWeapon(vx1);
        bs1.shooting();
        bs2.shooting();
        Circle cr1 = new Circle(new Point(4, 3), 3);
        System.out.println(cr1.square());

      */
      /*  Сuckoo ck1 = new Сuckoo("Ara");
        Sparrow sp1 = new Sparrow("rick");
        Сuckoo ck2 = new Сuckoo("Kesha");

        System.out.println(ck1);

        System.out.println(sum(1, 2.5, new Fraction(1, 2)));
        arrSongs(ck1, sp1, ck2);

        Cat c1 = new Cat("Jojo");
        arrMeow(c1);*/
    }


}


