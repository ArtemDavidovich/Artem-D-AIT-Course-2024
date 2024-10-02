package classwork_03;

// Задать целочисленные переменные x и y, выполнить c ними математические действия, напечатать результаты вместе с текстовыми пояснениями:
//- какие переменные участвовали;
//- какие действия с ними выполнялись;
//- что получилось в результате.

public class MathOperations {

    public static void main(String[] args) {

        int x = 38;
        int y = 63;

        System.out.println(x + y);

        int res = x + y;

        System.out.println("x = " + x + " складываем с y = " + y + " получаем " + res);

        System.out.println(res);

        res = x - y;

        System.out.println("x = " + x + " - y = " + y + " = " + res);

        System.out.println(res);

        res = x + y; // мы перезаписываем переменную, предыдущая актуальна вплоть до данной строки. Мы можем ввести новую переменную, например int res2

        System.out.println(res);

        // деление / целых чисел, дает целую часть

        res = y / x;

        System.out.println("y = " + y + " / x = " + x + " = " + res);

        // деление % целых чисел, дает остаток

        res = y % x;

        System.out.println("y = " + y + " % x = " + x + " = " + res);

    } // end of main

} // end of class
