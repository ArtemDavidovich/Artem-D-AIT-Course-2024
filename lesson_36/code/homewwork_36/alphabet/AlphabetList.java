package homewwork_36.alphabet;

//Задача 3.(*) Заполните структуру типа ArrayList<> символами латинского алфавита от A(65) до Z(...).

import java.util.ArrayList;

public class AlphabetList {

    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>();

        char l = 65;

        for (int i = 0; i < 26; i++) {
            letters.add(l);
            l++;
        }

        System.out.println(letters);

    }//end of main

}//end of class
