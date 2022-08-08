package E3;

public class Circle implements GeometricObject{

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 2*radius*3.14159265359;
    }

    @Override
    public double getArea() {
        return (radius*radius)*3.14159265359;
    }
}
