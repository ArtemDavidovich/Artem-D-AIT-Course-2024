package classwork_08;

//Распечатать в консоли все числа от 1 до 100, которые делятся на 5 без остатка.

public class Numbers {

    public static void main(String[] args) {

        int i = 1; //cycle parameter
        int end = 101;

        while (i < end){
            if(i % 5 == 0){
                System.out.print(i + " ");
            }
            i++; // postfix operation
        }

    }//end of main

}//end of class
