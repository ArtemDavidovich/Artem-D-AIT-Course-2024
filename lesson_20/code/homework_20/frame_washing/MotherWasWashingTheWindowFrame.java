package homework_20.frame_washing;

//Задание 2. Разработайте приложение, которое принимает от пользователя строку (некое предложение, например: "Мама мыла раму.") и выводит:
//
//количество символов в строке;
//количество символов в верхнем регистре;
//количество цифр в строке;
//количество пробелов в строке (код пробела = 32);
//в зависимости от последнего символа в строке сообщает, какое это предложение:
//повествовательное;
//вопросительное;
//восклицательное. Используйте методы класса Character.

import java.util.Scanner;

public class MotherWasWashingTheWindowFrame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a random string:");
        String str = scanner.nextLine();
        System.out.println(str);
        System.out.println("-----------------------");

        //number of symbols in the string
        System.out.println("There are " + str.length() + " in your string.");
        System.out.println("-----------------------");

        //number of upper case symbols in the string
        int sumUpperCase = 0;
        for(char ch : str.toCharArray()){
            if(Character.isUpperCase(ch)){
                sumUpperCase++;
            }
        }
        System.out.println("There are " + sumUpperCase + " upper case symbols in your string.");
        System.out.println("-----------------------");

        //number of digits in the string
        int sumDigits = 0;
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                sumDigits++;
            }
        }
        System.out.println("There are " + sumDigits + " digits in your string.");
        System.out.println("-----------------------");

        //number of spaces in the string
        int sumSpaces = 0;
        for(char ch : str.toCharArray()){
            if(Character.isWhitespace(ch)){
                sumSpaces++;
            }
        }
        System.out.println("There are " + sumSpaces + " spaces in your string.");
        System.out.println("-----------------------");

        //which type of sentence is it
        String lastCh = str.trim(); //removing spaces in the beginning and in the ending of the string
        char lastSymbol = str.charAt(lastCh.length() - 1); //extracting the last symbol for Character method isLetterOrDigit
        if(Character.isLetterOrDigit(lastSymbol) || Character.valueOf(lastSymbol) == '.'){
            System.out.println("The sentence is declarative.");
        } else if (Character.valueOf(lastSymbol) == '!'){
            System.out.println("The sentence is exclamatory.");
        } else if (Character.valueOf(lastSymbol) == '?'){
            System.out.println("The sentence is interrogative.");
        }

    }//end of main

}//end of class
