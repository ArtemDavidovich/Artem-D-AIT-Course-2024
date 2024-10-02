package classwork_07.cycles;

//Возведите 3 в степень 10, выведите на печать все промежуточные результаты.

public class Power {

    public static void main(String[] args) {

        int pow = (int) Math.pow(3, 10); // casting - преобразование типов, double в int и т.д.
        System.out.println(pow);

        //initial data

        int powCount = 1; // cycle parameter
        int res = 1;

        while (powCount <= 10){
            res = res * 3;
            System.out.println(res + " = 3 in power " + powCount);
            powCount++;
        }

        System.out.println("Process finished. The result is: " + res);

    }//end 0f main

}//end of class
