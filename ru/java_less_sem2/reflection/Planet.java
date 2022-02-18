package reflection;

public class Planet {
    private  String name;
    private int count;

    public Planet(String name){
        this.name=name;;
    }
    @Override
    public String toString() {
        return name;
    }
}
