package reflection;

public class Config {
    @BeanQ
    public static Planet mercury(){
        return new Planet("mercury");
    }
    @BeanQ
    public static Planet earth(){
        return new Planet("earth");
    }
    @BeanQ("sun")
    public static Star getSun(){
        return new Star(7);
    }
}
