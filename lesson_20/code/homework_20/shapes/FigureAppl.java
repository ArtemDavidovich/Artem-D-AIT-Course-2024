package homework_20.shapes;

//Задача 4.(*)
//
//Создайте абстрактный класс Shape с типом поля double (одно) и абстрактными методами calcArea и calcPerimeter.
//Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
//Напишите класс FigureAppl с методом main. В методе создайте массив фигур. Добавьте в массив два круга, один треугольник и один квадрат. Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

//Задача 5.(*) Рассчитайте общую площадь кругов из задачи 4. (instanceof)

import homework_20.shapes.model.Circle;
import homework_20.shapes.model.Shape;
import homework_20.shapes.model.Square;
import homework_20.shapes.model.Triangle;

public class FigureAppl {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(2.3);
        shapes[1] = new Circle(3.6);
        shapes[2] = new Triangle(6.0,4.6,3.1,5.3);
        shapes[3] = new Square(6.3);

        double totalArea = 0;
        double totalPerimeter = 0;

        for (int i = 0; i < shapes.length; i++) {
            totalArea += shapes[i].calcArea();
        }

        for (int i = 0; i < shapes.length; i++) {
            totalPerimeter += shapes[i].calcPerimeter();
        }

        System.out.printf("Total area of figures is: %.2f", totalArea);
        System.out.println();
        System.out.printf("Total perimeter of figures is: %.2f", totalPerimeter);
        System.out.println();

        double circlesArea = 0;

        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i] instanceof Circle){
                circlesArea += ((Circle) shapes[i]).calcArea();
            }
        }

        System.out.printf("Total area of circles is: %.2f", circlesArea);
        System.out.println();

    }//end of main

}//end of class
