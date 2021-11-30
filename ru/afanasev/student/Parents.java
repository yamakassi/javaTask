package ru.afanasev.student;

import ru.afanasev.name.NameNew;

import java.util.ArrayDeque;
import java.util.Deque;
public class Parents implements Observer {
    private NameNew name;
    private Student st;
    private Deque<Object> saveStudent = new ArrayDeque<>();
    public Parents(NameNew name, Student student){
        this.name=name;
        this.st=student;
    }
    public void undo(){
       var tmp=saveStudent.pop();
        st.restore(tmp);
    }
    public void save(){
        var m=st.save();
        saveStudent.push(m);
    }


    @Override
    public void update(String mess) {
        System.out.println("Получил "+mess);
    }
}
