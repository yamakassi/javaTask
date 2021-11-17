package ru.afanasev.main;

import ru.afanasev.animals.Bird;
import ru.afanasev.animals.Meowable;
import ru.afanasev.box.Storage;
import ru.afanasev.charter5_3.Application;
import ru.afanasev.geometry.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class StaticMetods   {

    private StaticMetods() {
        throw new AssertionError();
    }

    /*5.2.3 Начало отсчета. Создайте метод, принимающий Коробку из задачи 5.1.1, и кладет в неё
    трехмерную точку координат (из задачи 3.1.6) с произвольными значениями. Метод должен позволять
    передавать Коробку с более чем одним видом параметризации--???????/?/.*/
 static  void   pointInBox(Box<? super Point3D> box){
        Point3D p=new Point3D(1,1,1);
        box.putInOb(p);

    }
    
  static void addNumber(List<? extends Number> listNum){
    for(int i=0;i<100;i++){
        List.add(i);
    }
  }
    /*
5.3.1 Функция. Разработайте такой метод, который будет принимать список значений типа T, и объект
имеющий единственный метод apply. Данный метод надо применить к каждому элементу списка, и
вернуть новый список значений типа P, при этом типы T и P могут совпадать, а могут не совпадать.
Используйте разработанный метод следующим образом:
1. Передайте в метод список со значениями: “qwerty”, “asdfg”, “zx”, а получите список чисел, где
каждое число соответствует длине каждой строки.
2. Передайте в метод список со значениями: 1,-3,7, а получите список в котором все
отрицательные числа стали положительными, а положительные остались без изменений
3. Передайте в метод список состоящий из массивов целых чисел, а получите список в котором
будут только максимальные значения каждого из исходных массивов
*/
    {
        List<String>  str = new ArrayList<>();
     //   str.stream().min()
            //   java.util.Collections
    }

    static <T,P> List<P> funcApply(List<? extends T> masT, Application<T> ob){
        List<P> bf=new ArrayList<>();
        for (T cur: masT) {
            bf.add((P) ob.apply(cur));
        }


        return bf;
    }
    
    //2
  /*static <T> List funcApply(List<T> masT, Application ob){
        List bf=new ArrayList<>();
        for (T cur: masT) {
            bf.add(ob.apply(cur));
        }

        return bf;
    }*/
    

    static  double maxStorageNum(Storage<? extends Number>...storages) {//varargs

       double max=storages[0].getOutOb().doubleValue();

       for(int i=1;i<storages.length;i++){
           if(storages[i].getOutOb().doubleValue()>max) max=storages[i].getOutOb().doubleValue();
       }
       return  max;
    }
    //перенести в саму линию
    static void shiftLine(Line l){
        if(l.getStart().getX()>0) l.setStart(new Point(l.getStart().getX()+10,l.getStart().getY()));
        else l.setStart(new Point(l.getStart().getX()-10,l.getStart().getY()));
    }
    static int powStringNum(String x, String y) {
        return (int) pow(parseInt(x), parseInt(y));
    }


    static double sum(Number... pts) {
        double sum = 0;
        for (Number num : pts) {
            sum += num.doubleValue();
        }
        return sum;
    }

    static void arrSongs(Bird... birds) {
        for (Bird bird : birds) {
            bird.song();
        }
    }

    static int sumSquare(Figure... figures) {
        int sum = 0;
        for (Figure f : figures) {
            sum += f.square();
        }
        return sum;
    }

    static void arrMeow(Meowable... meowables) {
        for (Meowable x : meowables) x.meow();
    }

    static double totalLength(Measurable... arrLine) {
        double sum = 0;
        for (Measurable x : arrLine) sum += x.fullLine();
        return sum;
    }

    static Polyline getPolyline(MultiLine... arrPolyline) {
        ArrayList<Point> arrpoints = new ArrayList<>();

        for (MultiLine x : arrPolyline) arrpoints.addAll(arrpoints.size(), x.toPolyline().getPoints());
        return new Polyline(arrpoints);
    }
}
