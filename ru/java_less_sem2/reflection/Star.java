package reflection;

public class Star {
    private int brightness;

    public  Star(int brightness){
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "reflection.Star{" +
                "brightness=" + brightness +
                '}';
    }
}
