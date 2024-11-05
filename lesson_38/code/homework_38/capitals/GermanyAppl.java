package homework_38.capitals;

//Задача 2. В классе GermanyAppl cоздать LinkedList, содержащий города - столицы земель Германии. Опробовать на нем методы, которые доступны для класса LinkedList. Добавить вольный город Гамбург в начало, в середину списка, в конец списка. Отсортировать список по алфавиту и в обратном порядке.

import java.util.Collections;
import java.util.LinkedList;

public class GermanyAppl {

    public static void main(String[] args) {

        LinkedList<String> germanStateCapitals = new LinkedList<>();

        germanStateCapitals.add("Stuttgart");
        germanStateCapitals.add("Munich");
        germanStateCapitals.add("Berlin");
        germanStateCapitals.add("Potsdam");
        germanStateCapitals.add("Bremen");
        germanStateCapitals.add("Hamburg");
        germanStateCapitals.add("Wiesbaden");
        germanStateCapitals.add("Schwerin");
        germanStateCapitals.add("Hanover");
        germanStateCapitals.add("Düsseldorf");
        germanStateCapitals.add("Mainz");
        germanStateCapitals.add("Saarbrücken");
        germanStateCapitals.add("Dresden");
        germanStateCapitals.add("Magdeburg");
        germanStateCapitals.add("Kiel");
        germanStateCapitals.add("Erfurt");

        germanStateCapitals.addFirst("Hamburg");
        germanStateCapitals.add(germanStateCapitals.size() / 2, "Hamburg");
        germanStateCapitals.addLast("Hamburg");

        System.out.println(germanStateCapitals);

        System.out.println("============================");

        germanStateCapitals.sort(String::compareTo);
        System.out.println(germanStateCapitals);

        System.out.println("============================");

        germanStateCapitals.sort((a, b) -> b.compareTo(a));
        System.out.println(germanStateCapitals);

        System.out.println("============================");

        //alternative ways
        Collections.sort(germanStateCapitals);
        System.out.println(germanStateCapitals);

        germanStateCapitals.sort(Collections.reverseOrder());
        System.out.println(germanStateCapitals);

    }//end of main

}//end of class
