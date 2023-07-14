package Sort_Colors;

public class Colored_Object {

    public Color color;
    public int nr;
    public static int counter = 0;

    public Colored_Object(Color color) {
        this.color = color;
        this.nr = counter;
        counter++;
    }

    @Override
    public String toString(){
        return String.format("Object Nr. %s, Color %s", nr, color);
    }
}
