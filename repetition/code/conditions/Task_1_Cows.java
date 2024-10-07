package conditions;

//**Задача 1.**
//По данному числу n закончите фразу “На лугу пасется...” одним из возможных продолжений: “n коров“, “n корова“, “n коровы“, правильно склоняя слово “корова“.
//Входные данные: Дано целое положительное число n (n <= 10),
//Выходные данные: Программа должна вывести введенное число n и одно из слов: коров, корова или коровы, например, 1 корова, 2 коровы, 5 коров.

import java.util.Scanner;

public class Task_1_Cows {

    public static void main(String[] args) {

        phrase();

    }//end of main

    public static void phrase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of cows (n <= 10): ");
        int n = scanner.nextInt();

        System.out.print("На лугу пасется... ");

        if (n == 1){
            System.out.println(n + " корова.");
        } else if (n > 1 && n < 5) {
            System.out.println(n + " коровы.");
        } else {
            System.out.println(n + " коров.");
        }
    }

}//end of class
