package homework_03;

//Написать аппликацию (класс) с методами для вычисления различных величин
//Метод вычисляющий площадь квадрата по его стороне;
//Метод вычисляющий площадь круга по его радиусу;
//Метод вычисляющий периметр прямоугольника по двум сторонам; В методе main вызвать вышеуказанные методы с различными аргументами, и результаты вывести в консоль. Например:
//площадь круга для R = 200 равна ...
//площадь квадрата со стороной 500 составляет ...
//периметр прямоугольника со сторонами 1000 и 2000 равен ...

//Добавить методы, вычисляющие (*)
//Величину 3-го угла треугольника по известным первым двум.
//Площадь треугольника по стороне и высоте треугольника.
//Гипотенузу по двум катетам (теорема Пифагора).

public class HomeworkVariousQuantities {

    public static void main(String[] args) {

        areaSquare(); // площадь квадрата
        areaCircle(); // площадь круга
        perimeterRectangle(); // периметр прямоугольника
        triangle();  // задачи с треугольником. Я принял за базовое условие, что мы имеем один прямоугольный треугольник для всех задач, опуская возможные нестыковки между сторонами, углами и т.д.
        exchangeDollarForEuro(); // перевод долларов в евро
        calorieAmount(); // количество съеденных калорий


    } // end of main



    public static void areaSquare(){

        double a = 500;
        double res = areaSquareMethod(a); // ищем площадь квадрата

        System.out.println("Площадь квадрата со стороной " + a + " равна " + res);

    } // end of areaSquare

    public static double areaSquareMethod(double a){

        return a*a; // Math.pow (double a, double b) - метод для возведения числа в степень, но он менее производительный и в случае возведения в квадрат или куб рекомендуют использовать просто умножение

    } // end of areaSquareMethod

    public static void areaCircle(){

        double r = 200;
        double res = areaCircleMethod(r); // ищем площадь круга через радиус

        System.out.println("Площадь круга для R = " + r + " равна " + res);

    } // end of areaCircle

    public static double areaCircleMethod(double r){

        return Math.PI * r * r;

    } // end of areaCircleMethod

    public static void perimeterRectangle(){

        double a = 1000;
        double b = 2000;
        double res = perimeterRectangleMethod(a, b); // ищем периметр прямоугольника

        System.out.println("Периметр прямоугольника со сторонами " + a + " и " + b + " равен " + res);

    } // end of perimeterRectangle

    public static double perimeterRectangleMethod(double a, double b){

        return a+a+b+b;

    } // end of perimeterRectangleMethod

    public static void triangle(){

        double x = 90; // первый угол треугольника
        double y = 37; // второй угол треугольника
        double a = 7; // первый катет треугольника
        double b = 9; // второй катет треугольника
        double h = 5; // высота треугольника (опускается на гипотенузу)

        double z = thirdAngleMethod(x, y); // ищем третий угол треугольника через два других угла
        System.out.println("Третий угол треугольника при первых двух углах равных " + x + " и " + y + " равен " + z);

        double c = hypotenuseMethod(a, b); // ищем гипотенузу треугольника через два катета
        System.out.println("Гипотенуза треугольника при катетах равных " + a + " и " + b + " равна " + c);

        double area = areaTriangleMethod(h, c); // ищем площадь треугольника через высоту и основание (в нашем случае гипотенузу)
        System.out.println("Площадь треугольника при высоте " + h + " и основании " + c + " равна " + area);


    } // end of triangle

    public static double thirdAngleMethod(double x, double y){

        return 180 - x - y;

    } // end of thirdAngleMethod

    public static double hypotenuseMethod(double a, double b){

        double c = a*a + b*b;
        return Math.sqrt(c); // Math.sqrt(double a) - метод для нахождения квадратного корня

    } // end of hypotenuseMethod

    public static double areaTriangleMethod(double h, double c){

        return h * c / 2;

    } // end of areaTriangleMethod

    public static void exchangeDollarForEuro(){

        double rate = 0.90; // кросскурс доллар - евро
        double money = 500; // количество долларов
        double exchangeRes = exchangeDollarForEuroMethod(rate, money);

        System.out.println("При переводе " + money + " Долларов в Евро при кросс-курсе Доллар-Евро равном " + rate + " мы получим " + exchangeRes + " Евро.");

    } // end of exchangeDollarForEuro

    public static double exchangeDollarForEuroMethod(double rate, double money){

        return rate * money;

    } // end of exchangeDollarForEuroMethod

    private static void calorieAmount(){

        double weight = 200; // грамм
        double calorage = 50; // калорий на 100 г
        double diet = calorieAmountMethod(weight, calorage);

        System.out.println("При употребленных " + weight + " граммах продукта и калораже " + calorage + " килокалорий на 100г продукта получаем " + diet + " килокалорий.");

    } // end of calorieAmount

    private static double calorieAmountMethod(double weight, double calorage){

        return weight * calorage / 100;

    } // end of calorieAmountMethod

} // end of class
