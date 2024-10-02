package classwork_09;

//Доработать калькулятор так, чтобы он продолжал работать после выполнения одного действия с парой чисел.

import java.util.Scanner;

public class Calculator {

    static int num1, num2, action;
    static int result;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // start here
        boolean flag = true;

        while(flag) {

            System.out.println("Continue? y/n");
            char ch = scanner.next().charAt(0); //next - возможность взять строку, charAt - номер символа в строке
            if(ch != 'y'){
                System.exit(0);
            }

            System.out.println("Input 1st number: ");
            num1 = scanner.nextInt();
            System.out.println("Input 2nd number: ");
            num2 = scanner.nextInt();
            System.out.println("Select the operation or 0 for exit");
            System.out.println("1 -> '+'");
            System.out.println("2 -> '-'");
            System.out.println("3 -> '*'");
            System.out.println("4 -> '/'");
            System.out.println("5 -> '%'");
            System.out.println("0 -> Escape");
            action = scanner.nextInt();

            switch (action) {
                case 1 -> result = sum(num1, num2);
                case 2 -> result = deduction(num1, num2);
                case 3 -> result = multiply(num1, num2);
                case 4 -> result = division(num1, num2);
                case 5 -> result = remainderFromDivision(num1, num2);
                case 0 -> flag = false;
                default -> System.out.println("Wrong input!");
            }

            System.out.println("The result is: " + result);

            //restart program

        }

    }//enf of main

    private static int sum(int num1, int num2){
        return num1 + num2;
    }//end of sum

    private static int deduction(int num1, int num2){
        return num1 - num2;
    }//end of deduction

    private static int multiply(int num1, int num2){
        return num1 * num2;
    }//end of multiply

    private static int division(int num1, int num2){
        return num1 / num2;
    }//end of division

    private static int remainderFromDivision(int num1, int num2){
        return num1 % num2;
    }//end of remainderFromDivision

}//end of class
