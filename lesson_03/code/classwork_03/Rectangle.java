package classwork_03;

//    Вычислить площадь прямоугольника.
//    Задайте длину и ширину прямоугольника как переменные типа double.
//    Создайте метод, который получает на вход два числа типа double и возвращает тип double площадь прямоугольника.

public class Rectangle {

    public static void main(String[] args) {

        double a = 125.37d; // можно добавлять d, а можно и не добавлять, это по желанию
        double b = 35.0;

        // solution 1
        double area = a * b;
        System.out.println("Area of rectangle: " + area);

        // solution 2 with method

        area = areaOfRectangle(a, b);
        System.out.println(area); // НЕ ЗАБЫВАТЬ SOUT!!! ДЛЯ ВЫВОДА РЕЗУЛЬТАТА В КОНСОЛЬ

    } // end of main

    public static double areaOfRectangle(double a, double b){
        double res = a * b;
        return res;

    } // end of areaOfRectangle

} // end of class
