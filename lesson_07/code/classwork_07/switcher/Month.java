package classwork_07.switcher;

import java.util.Scanner;

public class Month {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //приглашение пользователю
        System.out.println("Input number of month: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> System.out.println("This is January.");
            case 2 -> System.out.println("This is February.");
            case 3 -> System.out.println("This is March.");
            case 4 -> System.out.println("This is April.");
            case 5 -> System.out.println("This is May.");
            case 6 -> System.out.println("This is June.");
            case 7 -> System.out.println("This is July.");
            case 8 -> System.out.println("This is August.");
            case 9 -> System.out.println("This is September.");
            case 10 -> System.out.println("This is October.");
            case 11 -> System.out.println("This is November.");
            case 12 -> System.out.println("This is December.");
        }

    }//end of main

}//end of class
