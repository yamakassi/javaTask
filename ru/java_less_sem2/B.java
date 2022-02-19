package task7;

import task7.annotation.Default;
import task7.annotation.ToString;
import task7.annotation.YesOrNot;

//7.1.1
@ToString(YesOrNot.NO)
public class B extends A{

    String name ="B";

    public String getName() {
        return name;
    }
}
