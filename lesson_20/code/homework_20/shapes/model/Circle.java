package homework_20.shapes.model;

public class Circle extends Shape {

    public Circle(double d) {
        super(d);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "d=" + d +
                "} ";
    }

    @Override
    public double calcArea() {
        return Math.PI * d * d;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * d;
    }
}
