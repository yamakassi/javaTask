package ru.afanasev.student;

import ru.templateTaskOOP.creational.builder.NameNew;

import java.util.ArrayDeque;
import java.util.Deque;
public class Parents implements Observer {
    private NameNew name;
    private Student st;
    private Deque<MementoST> saveStudent = new ArrayDeque<>();
    public Parents(NameNew name, Student student){
        this.name=name;
        this.st=student;
    }
    public void undo(){
       MementoST tmp=saveStudent.pop();
        st.restore();
    }
    public void save(){
        MementoST m=st.save();
        saveStudent.push(m);
    }


    @Override
    public void update(String mess) {
        System.out.println("Получил "+mess);
    }
}
