package classwork_08;

//Распечатать в консоли таблицу умножения от 1 до 10.

public class MultiplicationTable {

    public static void main(String[] args) {

        // cycle in cycle

        int i = 1, j = 1;

        while(i < 11){
            while(j < 11){

                System.out.print(i + " x " + j + " = " + (i*j) + " | ");
                j++;

            }//end of while j

            j = 1;
            i++;
            System.out.println(); //next line

        }//end of while i

    }//end of main

}//end of class
