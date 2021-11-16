package ru.afanasev.box;

public class Box<T> {
   private  T obj;
    private Box(T obj){
        this.obj=obj;
    }
    public Box<T> putInOb(T ob){
        if(boxFull()) throw new IllegalArgumentException("the box is already filled");

        return new Box<>(obj);
    }
  public T getOutOb(){
        T tmp = obj;
        obj=null;
        return tmp;
    }

     boolean boxFull(){
         return obj != null;
     }

    @Override
    public String toString() {
        return "Box{" +
                "ob=" + obj +
              '}';
    }
}
