package cycles;

//**Задача 5.**
//Программа просит пользователя ввести строку
//“/|\’Hello’ ‘World’\|/ @*#&$%^_+-{[xx]} !”
//Если пользователь вводит строку правильно, то программа распечатывает на экран благодарность и завершает работу.
//Если вводится неверная строка, то программа просит ввести строку снова, до тех пор, пока у пользователя это не получится.
//Дополнительно: считать кол-во попыток, которые потребовались пользователю для введения правильной строки.
//По окончанию - вывести число попыток на экран.

import java.util.Scanner;

public class Task_5_String {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the following string:");
        System.out.println("“/|’Hello’ ‘World’|/ @*#&$%^_+-{[xx]} !");
        String strUser = scanner.nextLine();

        String str = "“/|’Hello’ ‘World’|/ @*#&$%^_+-{[xx]} !";

        int count = 0;

        while(!(strUser.equals(str))){
            count++;
            System.out.println("The input was incorrect! Please, repeat.");
            System.out.println("The string:");
            System.out.println("“/|’Hello’ ‘World’|/ @*#&$%^_+-{[xx]} !");
            strUser = scanner.nextLine();
        }

        System.out.println("The input was correct! Thank you so much! Have a nice day!");
        System.out.println("Number of incorrect tries: " + count);

    }//end of main

}//end of class
