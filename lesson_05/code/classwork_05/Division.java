package classwork_05;

//Реализовать метод, определяющий, делится ли одно целое число на другое нацело или нет.

public class Division {

    public static void main(String[] args) {

        int a = 35;
        int b = 8;
        boolean res = isDividedMethod(a, b);
        System.out.println("a = " + a + " , b = " + b + " is divided: " + res);

    } // end of main

    public static boolean isDividedMethod(int a, int b){
        return a % b == 0;
    }

} // end of class
