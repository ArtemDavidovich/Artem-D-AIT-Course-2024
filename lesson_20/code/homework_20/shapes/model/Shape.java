package homework_20.shapes.model;

//Задача 4.(*)
//
//Создайте абстрактный класс Shape с типом поля double (одно) и абстрактными методами calcArea и calcPerimeter.
//Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
//Напишите класс FigureAppl с методом main. В методе создайте массив фигур. Добавьте в массив два круга, один треугольник и один квадрат. Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

public class Shape {

    double d; //abstract variable for all figures

    public Shape(double d) {
        this.d = d;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "d=" + d +
                '}';
    }

    public double calcArea() {
        return 0;
    }


    public double calcPerimeter(){
        return 0;
    }

}
