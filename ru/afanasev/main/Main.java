package ru.afanasev.main;

import ru.afanasev.security.Access;
import ru.afanasev.security.Human;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Human h1=new Human("vasia",18,172);
       List<Predicate<Human>> li= Arrays.asList((x)->x.getAge()>18,(x)->x.getName().length()>4);

       Access c1 = new Access(li);
      Access c2 = Access.createAccess(c1,List.of((x)->x.getAge()>10));

        
       // Access c2=Access.createAccess(c1,jdkfjdl);
        
       /*
      Sub1 sb1= new Sub1(new Grade1(),new Grade2());


        Student st1= new Student("Pety");
        st1.addAverage(sb1,new Grade());
        System.out.println( st1.marks.get(0).getClass());
        /*NameNew name=new NameNew.Builder("ivan").lastname("Ivanov").build();


        Student st = new Student("vasia");
        //st.addAllMarks(4, 4, 3, 5);
        Parents p1=new Parents(name,st);
        System.out.println(st);
        p1.save();
        System.out.println(st);
       // st.delMarks();

        System.out.println(st);
        p1.undo();
        System.out.println(st);

        st.subscribe(p1);
      //  st.addMark(2);
       /* //Student st=new Student("vasia",null,2,46,7,0,10);
        Student st1=new Student("Petya",Rule.RuleOne,5,10,5,5,10,10);

        System.out.println(st1);
        st1.delMarks();
        System.out.println(st1);
        st1.addEndMarks(5);
        System.out.println(st1);
        st1.undo();
        System.out.println(st1);
        st1.undo();
        System.out.println(st1);
st1.undo();
        System.out.println(st1);
st1.undo();
        System.out.println(st1);

        // Student st2=new Student("Lex",rule1,2,4,3);
        

      //  System.out.println(st2);
     /*StorageNew<String> st = StorageNew.createStorageNull(null);
     StorageNew<String> st1 = StorageNew.createStorageNull("ll");
        System.out.println(st==st1);
        
         List<String> strings = new ArrayList<>();
        strings.add("qwe");
        strings.add("qfsdwe");
        strings.add("qwffsdfsdfe");
      
       // strings.add(strings.size() - 1, "s");

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
        StaticMeto68ds.pointInBox(n1);
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


