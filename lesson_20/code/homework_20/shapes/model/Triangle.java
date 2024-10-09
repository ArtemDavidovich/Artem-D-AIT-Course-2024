package homework_20.shapes.model;

public class Triangle extends Shape {

    private double h; //height of triangle
    private double a; // first leg of triangle
    private double b; //second leg of a triangle

    public Triangle(double d, double h, double a, double b) {
        super(d);
        this.h = h;
        this.a = a;
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calcArea() {
        return (d * h) / 2;
    }

    @Override
    public double calcPerimeter() {
        return d + a + b;
    }
}
