package homework_12;

//Задача 2. Вводится n - натуральное число.
//Напишите метод, который получает на вход n и вычисляет n! = 1 * 2 * 3 *... * n.
//Вызовите полученный метод. При каком значении n происходит переполнение памяти (результат станет отрицательным), выделяемой для значения n! типа int? Использовать цикл for.

public class Task_2_Repetition {

    public static void main(String[] args) {

        int n = 20;//variable for factorial
        int factorial =  factorialCalculation(n); //calling the method with factorial calculation

        System.out.println("The result of factorial of " + n + " is: " + factorial);

        memoryOverload(n, factorial);

    }//end of main

    //method for factorial calculation
    public static int factorialCalculation(int n){
        int[] fact = new int[n];
        int res = 1;
        for (int i = 0; i < fact.length; i++) {
            fact[i] = i + 1;
            System.out.print(fact[i]);
            if(i < fact.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < fact.length; i++) {
            res = res * fact[i];
        }
        return res;
    }

    //method for memory overload check
    public static void memoryOverload (int n, int check) {

        while (check >= 0){
            n++;
            int[] fact = new int[n];
            check = 1;
            for (int i = 0; i < fact.length; i++) {
                fact[i] = i + 1;
            }
            for (int i = 0; i < fact.length; i++) {
                check = check * fact[i];
            }
        }
        while (check < 0) {
                int[] fact = new int[n];
                check = 1;
                for (int i = 0; i < fact.length; i++) {
                    fact[i] = i + 1;
                }
                for (int i = 0; i < fact.length; i++) {
                    check = check * fact[i];
                    if (check < 0){
                        System.out.println("The number thar overloads the memory for int is: " + (i + 1));
                        break; // immediately stops the cycle
                    }

                }
            break;
        }

    }//end of method

}//end of class
