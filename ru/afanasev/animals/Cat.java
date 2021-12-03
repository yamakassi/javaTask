package ru.afanasev.animals;
public class Cat implements Meowable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }
    public  void meow(){
        meow(1);
    }
    public  void meow(int count){
        String str=name+":";
        while (count>0){
            str+=" мяу!";
            count--;
        }
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "Cat:" + name;
    }
}
