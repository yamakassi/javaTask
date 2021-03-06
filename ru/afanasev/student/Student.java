package ru.afanasev.student;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
     public List<Average> marks = new ArrayList<>();
    private Verifiable check = x->true;
    private Verifiable checked = check;
    private Deque<Action> actions = new ArrayDeque<>();
    private List<Observer> observers = new ArrayList<>();
    private    class SaveST implements MementoST {
        String nameST=name;
        List<Average> marksST=new ArrayList<>(marks);



    }
    public Student(String name,Verifiable right) {
        this.name = name;
       this.checked=right;
     }

     public  Student(String name){
         this.name=name;
     }
public void addAverage(Average...aver){
      for(Average a:aver)  this.marks.add(a);
}
    public String getName() {
        return name;
    }
    public void setName(String name){
        String tmp = this.name;
        actions.push(()->this.name=tmp);
        this.name=name;
    }
    public  void undo(){
        if(actions.isEmpty())  throw new IllegalCallerException("Отмен больше нет"); //кинуть ошибку, о том что отмен больше нет
        actions.pop().action();
    }
    public List<Average> getMarks() {
        return  new ArrayList<>(marks);
    }

   /* public void addMarks(int...mass){
        for(int x:mass){
            if(checked.check(x))  this.marks.add(x);
           else throw new IllegalArgumentException(x + "is not a legal mark;");
        }
    }*/


  /*  public void addMark(int val){

        if(checked.check(val)){
            actions.push(()->this.marks.remove(marks.size()-1));
            this.marks.add(val);
            if(val==2) this.STnotify("2");

        }
        else throw new IllegalArgumentException(val + "is not a legal mark;");
    }
    public void delAllMarks(){
        this.marks.clear();
    }
    public void delMarks(){
        int tmp = marks.get(marks.size()-1);
        actions.push(()->this.marks.add(tmp));
        this.marks.remove(marks.size()-1);
    }
    public void addAllMarks(int...marks){
        for (int x : marks) {
            if(checked.check(x))  this.marks.add(x);
            else throw new IllegalArgumentException(x + "is not a legal mark;");
        }
    }*/

   public SaveST save(){
        return new SaveST();
   }
   public void restore(){
       // this.name=nameST;
       // this.marks=marksST;
   }

   public void subscribe(Observer observ){
        this.observers.add(observ);
   }
   public void unsubcribe(Observer observ){
        this.observers.remove(observ);
   }
   public void STnotify(String mess){
        for(Observer obs:observers){
            obs.update(mess);
        }
   }



//    @Override
//    public int compareST(Student ob1) {
//        if(this.mean()==ob1.mean()) return  0;
//
//        if ( this.mean()>ob1.mean()) return 1;
//        else return -1;
//    }

    @Override
    public int compareTo(Student o) {
      return this.name.length()-o.getName().length();
    }
      public String toString() {
        return "Student {" + name + ", marks=" + marks + "}";
    }



}
