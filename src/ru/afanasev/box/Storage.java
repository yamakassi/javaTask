package ru.afanasev.box;

public class Storage<T> {

   public  final T ob;

    public Storage(T ob){
        this.ob=ob;
    }
    public T getOutOb(){
        if(ob== null) return (T) "hello";
        return ob;
    }

    boolean boxFull(){
        return ob != null;
    }

    @Override
    public String toString() {
        return "{" +
                "ob=" + ob +
                '}';
    }

}
