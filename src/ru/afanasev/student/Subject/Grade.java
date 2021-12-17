package ru.afanasev.student.Subject;

import ru.afanasev.student.Average;

public class Grade implements Average {
    public double grade=5;


    @Override
    public double arifGrade() {
        return grade;
    }
}
