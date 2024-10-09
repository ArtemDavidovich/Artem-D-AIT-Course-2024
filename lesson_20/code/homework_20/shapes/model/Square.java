package homework_20.shapes.model;

public class Square extends Shape {

    public Square(double d) {
        super(d);
    }

    @Override
    public String toString() {
        return "Square{" +
                "d=" + d +
                "} ";
    }

    @Override
    public double calcArea() {
        return d * d;
    }

    @Override
    public double calcPerimeter() {
        return d * 4;
    }
}
