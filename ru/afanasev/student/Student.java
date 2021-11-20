package ru.afanasev.student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private  List<Integer> marks = new ArrayList<>();
    private Verifiable checked = x -> true;

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
        this.name=name;
    }

    public List<Integer> getMarks() {
        return  new ArrayList<>(marks);
    }
    public void addMarks(int...mass){
        for(int x:mass){
            if(checked.check(x))  this.marks.add(x);
           else throw new IllegalArgumentException(x + "is not a legal mark;");
        }
    }
    public void delAllMarks(){
        this.marks.clear();
    }
    public void delMarksFirst(int size){
        this.marks.remove(size);
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
