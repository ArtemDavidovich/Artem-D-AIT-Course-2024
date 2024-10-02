package classwork_05;

//Написать метод, возвращающий максимальное из двух целых чисел.
//Реализовать метод, который возвращает максимальное из трех целых чисел. Числа задаются в программе.
//Написать метод, возвращающий максимальное из двух целых чисел, использовать тернарный оператор.

public class Maximum {

    public static void main(String[] args) {

        int a = 45;
        int b = 123;

        // здесь будет вызов метода
        int max = maximumMethod(a, b);

        System.out.println("Maximum = " + max);

    } // end of main

    // здесь будет метод
    private static int maximumMethod(int a, int b){
        int max;
        if(a>=b){
          max = a;
        } else {
            max = b;
        }
        return max;
    } // end of maximumMethod


} // end of class
