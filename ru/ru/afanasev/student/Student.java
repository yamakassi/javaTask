package ru.afanasev.student;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private  List<Integer> marks = new ArrayList<>();
    private Verifiable checked = x -> true;
    private Deque<Action> actions = new ArrayDeque<>();

    public Student(String name,Verifiable right,int...marks) {
        this.name = name;
       if(right!=null) this.checked=right;
        for (int x : marks) {
           if(checked.check(x))  this.marks.add(x);
           else throw new IllegalArgumentException(x + "is not a legal mark;");
        }
       

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
    public List<Integer> getMarks() {
        return  new ArrayList<>(marks);
    }
   /* public void addMarks(int...mass){
        for(int x:mass){
            if(checked.check(x))  this.marks.add(x);
           else throw new IllegalArgumentException(x + "is not a legal mark;");
        }
    }*/


    public void addEndMarks(int val){
        if(checked.check(val)){
            actions.push(()->this.marks.remove(marks.size()-1));
            this.marks.add(val);
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
