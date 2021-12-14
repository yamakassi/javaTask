package ru.afanasev.student.Subject.Sub2;

import ru.afanasev.student.Average;

import java.util.ArrayList;
import java.util.List;

public class Sub2 implements Average {
    List<Average> marks = new ArrayList<>();
    public Sub2(Average... aver){
        for(Average a:aver)  this.marks.add(a);
    }



    @Override
    public double arifGrade() {
        double tmp=0;
        for(Average num:marks ){ tmp+= num.arifGrade();}
        return tmp/marks.size();
    }
}
