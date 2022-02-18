package reflection;

import reflection.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
       // container.load(Config.class);
        List lst = container.listObjects();
        SolarSystem solarSystem= new SolarSystem();
        for(int i=0;i<lst.size();i++){
            if(lst.get(i) instanceof Star) solarSystem.sun = (Star) lst.get(i);
            else  solarSystem.planets.add((Planet) lst.get(i));
        }
        System.out.println(solarSystem);
    }
}
