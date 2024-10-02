package homework_13;

//Task 3(*). Write a method that takes as input an array of strings.
//The method must return an array consisting of the shortest and longest strings of the original array.
//Create a String array and fill it with the names of cities you know.
//Test the operation of the written method on this array.

import java.util.Arrays;

public class Task_3_Strings {

    public static void main(String[] args) {

        String[] cities = {"Minsk", "Riga", "London", "Hamburg", "Augsburg", "Capetown", "Antananarivo", "Torino"};

        String[] twoCities = lengthOfStrings(cities);

        System.out.println(Arrays.toString(twoCities));

    }//end of main

    private static String[] lengthOfStrings(String[] array){
        String shortestCity = array[0]; //variable for shortest string
        String longestCity = array[0]; //variable for longest string

        //foreach loop/cycle, it's created for simple checks when we don't need to work with indexes
        //and  just want to look through the elements of array
        for (String temp : array) {
            if(temp.length() < shortestCity.length()){ //comparing the length of our string variable and elements (one by one) of array
                shortestCity = temp;
            } if (temp.length() > longestCity.length()){
                longestCity = temp;
            }
        }
        return new String[] {shortestCity, longestCity};
    }

}//end of class
