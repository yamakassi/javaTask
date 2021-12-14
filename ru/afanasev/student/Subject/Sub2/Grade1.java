package ru.afanasev.student.Subject.Sub2;

import ru.afanasev.student.Average;

public class Grade1 implements Average {
    public double grade=5;


    @Override
    public double arifGrade() {
        return grade;
    }
}
