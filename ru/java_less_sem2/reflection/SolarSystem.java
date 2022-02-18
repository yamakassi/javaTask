package reflection;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    Star sun;
    List<Planet> planets=new ArrayList<>();

    @Override
    public String toString() {
        return "reflection.SolarSystem{" +sun+
                "planets=" + planets +
                '}';
    }
}
