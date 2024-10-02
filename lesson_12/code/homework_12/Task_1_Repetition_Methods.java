package homework_12;

//Задача 1. Составьте программу, которая вычисляет сумму чисел от 1 до 1/n, n вводится с клавиатуры.
//Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10 Использовать цикл for.

public class Task_1_Repetition_Methods {

    //filling in array
    public static double[] fillInArray(int a){
        double[] res = new double[a];
        for (int i = 0; i <= res.length; i++) {
            if (i == 0) {
                res[i] = 1;
            } else if (i < res.length) {
                res[i] = 1 / ((double) i + 1);
            }
        }
        return res;
    }

    //printing array
    public static void printArray(double[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("-----------------------------------");
    }

    //calculating array
    public static double sumCalculation(double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    //printing final result
    public static void printResult(double sum){
        System.out.printf("The sum of numbers in array is %.2f", sum);
    }

}//end of class
