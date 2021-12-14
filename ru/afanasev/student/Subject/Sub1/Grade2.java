package ru.afanasev.student.Subject.Sub1;

import ru.afanasev.student.Average;

public class Grade2 implements Average {
    public double grade=5;


    @Override
    public double arifGrade() {
        return grade;
    }
}
