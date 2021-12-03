package ru.afanasev.student;

import java.util.List;

public interface MementoST {
    public String getName();
    public List<Integer> getMarks();
    public void restore();
}
