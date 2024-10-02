package classwork_10;

//Имеются оценки абитуриента из его аттестата.
//Найдите средний балл абитуриента.

public class Task_3_StudentMarks {

    public static void main(String[] args) {

        int[] marks = {1, 6, 1, 4, 3, 1, 2, 3, 3, 2, 5, 2, 3}; //объявление массива в явном виде

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];

        }

        System.out.println("Sum = " + sum);

        double averageMark = (double) sum / marks.length;

        System.out.println("Average mark is " + averageMark);


    }//end of main

}//end of class
