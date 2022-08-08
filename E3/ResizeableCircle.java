package E3;

public class ResizeableCircle extends Circle implements  Resizable{


    public ResizeableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizeableCircle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void resize(int percent) {
        radius *= percent/100.0;
    }
}
