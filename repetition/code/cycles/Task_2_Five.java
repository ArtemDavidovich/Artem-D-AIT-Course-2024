package cycles;

//**Задача 2.**
//Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка.
//Использовать цикл do...while.

public class Task_2_Five {

    public static void main(String[] args) {

        int n = 5;
        int count = 0;

        do {
            if(n % 5 == 0){
                System.out.print(n + " ");
            count++;
            }
            n++;
        } while (count < 7 || n <= 100);

    }//end of main

}//end of class
