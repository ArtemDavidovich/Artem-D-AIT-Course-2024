package homework_38.students;

//Задача 3.(*) Распределить группу студентов на две примерно равных группы (+/- 1 человек) случайным образом. Определить список студентов в программе. Получить на выходе 2 списка студентов.

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentsAppl {


    public static void main(String[] args) {

        List<String> students = new LinkedList<>();
        students.add("PeterSchneider");
        students.add("SusanneBoyle");
        students.add("JohnSmith");
        students.add("MaryJohnson");
        students.add("JamesWilliams");
        students.add("PatriciaBrown");
        students.add("MichaelJones");
        students.add("LindaMiller");
        students.add("RobertDavis");
        students.add("BarbaraWilson");
        students.add("WilliamMoore");
        students.add("ElizabethTaylor");
        students.add("CharlesAnderson");
        students.add("JenniferThomas");
        students.add("JosephJackson");

        List<String> groupOne = new ArrayList<>();
        List<String> groupTwo = new ArrayList<>();

        int randNum = 0;
        int randGr = 0;

        while(!students.isEmpty()) {
            randNum = (int) (Math.random() * (((students.size() - 1) - 1 + 1) + 1));
            randGr = 1 + (int) (Math.random() * 2);
            if(groupOne.size() < 8 && groupTwo.size() < 8){
                switch(randGr){
                    case 1 -> groupOne.add(students.get(randNum));
                    case 2 -> groupTwo.add(students.get(randNum));
                }
            } else if  (groupOne.size() > 7){
                groupTwo.add(students.get(randNum));
            } else {
                groupOne.add(students.get(randNum));
            }
            students.remove(randNum);
        }

        System.out.println("First group:");
        System.out.println(groupOne);
        System.out.println("========================================");
        System.out.println("Second group:");
        System.out.println(groupTwo);

    }//end of main

}//end of class
