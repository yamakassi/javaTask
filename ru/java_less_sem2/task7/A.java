package task7;

import task7.annotation.Default;
import task7.annotation.Invoke;

//7.1.1
public class A  extends  Entity{
    int x = 77;
    @Default("42")
    String txt="hello world";

    @Invoke
     void m1(){
        System.out.println(txt);
    }
}
