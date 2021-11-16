package ru.afanasev.student;
import java.util.Arrays;

public class Student implements ComparableST<Student>,Comparable {
    private String name;
    private int[] marks;


    public Student(String name, int...marks) {
        this.name = name;
        for (int x : marks) {
            if (x < 2 || x > 5) throw new IllegalArgumentException(x + "is not a legal mark;");


        }
        this.marks = Arrays.copyOf(marks, marks.length);

    }

    public String getName() {
        String name = this.name;
        return name;
    }

    public int[] getMarks() {
        return Arrays.copyOf(marks, marks.length);
    }

    public double mean() {
        double arf = 0;
        if (marks.length == 0) return 0;
        for (double mark : marks) arf += mark;

        return arf / marks.length;
    }

    public boolean hasExcellent() {
        if (mean() == 5) {

            return true;
        }

        return false;

    }

    public String toString() {
        return "Student {" + name + ", marks=" + Arrays.toString(marks) + "}";
    }

    @Override
    public int compareST(Student ob1) {
        if(this.mean()==ob1.mean()) return  0;

        if ( this.mean()>ob1.mean()) return 1;
        else return -1;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    /*@Override
    public int compareTo(Object o) {
        return 0;
    }9*/
}
