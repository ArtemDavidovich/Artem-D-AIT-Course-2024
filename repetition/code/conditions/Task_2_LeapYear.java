package conditions;

//**Задача 2(*).**
//Написать программу, определяющую, является ли год високосным.
// Значение года задается в программе или вводится пользователем с клавиатуры.
//Для того чтобы год был високосным, он должен:
// делится без остатка на 4 и,
// либо не должен делится без остатка на 100,
// либо если он делится на 100, то он должен делится также на 400.
// Проверить на годах 1700, 1800, 1900 - не високосные, а 2000 високосный.

public class Task_2_LeapYear {

    public static void main(String[] args) {

        int[] years = {1700, 1800, 1900, 2000};

        for (int i = 0; i < years.length; i++) {
            if(years[i] % 4 == 0){
                if(years[i] % 100 > 0){
                    System.out.println(years[i] + " is leap.");
                } else if(years[i] % 100 == 0 && years[i] % 400 == 0){
                    System.out.println(years[i] + " is leap.");
                } else {
                    System.out.println(years[i] + " is NOT leap.");
                }
            } else {
                System.out.println(years[i] + " is NOT leap.");
            }
        }


    }//end of main

}//end of class
