package homewwork_36.array_list_tutorial;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTutorial {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)

        System.out.println(cars);

        System.out.println("--------------------------");

        System.out.println(cars.get(0));

        System.out.println("--------------------------");

        cars.set(0, "Opel");
        System.out.println(cars.get(0));

        System.out.println("--------------------------");

        cars.remove(0);
        System.out.println(cars);

        System.out.println("--------------------------");

        System.out.println(cars.size());

        System.out.println("--------------------------");

        cars.clear();
        System.out.println(cars);

        System.out.println("--------------------------");

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println("--------------------------");

        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println("--------------------------");

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }

        System.out.println("--------------------------");

        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println("--------------------------");

        ArrayList<Integer> myNewNumbers = new ArrayList<Integer>();
        myNewNumbers.add(33);
        myNewNumbers.add(15);
        myNewNumbers.add(20);
        myNewNumbers.add(34);
        myNewNumbers.add(8);
        myNewNumbers.add(12);

        Collections.sort(myNewNumbers);  // Sort myNumbers

        for (int i : myNewNumbers) {
            System.out.println(i);
        }

    }//end of main

}//end of class
