package homework_37.protocol;

//Создайте приложение, которое позволит ввести в компьютер результаты спортсменов и получить итоговый протокол соревнования.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AthleteAppl {

    public static void main(String[] args) {

        //setting scanner for input
        Scanner scanner = new Scanner(System.in);
        List<Athlete> athletes = new ArrayList<>();

        System.out.println("Input the protocol (10 athletes):");

        //inputting athletes foк protocol
        for (int i = 0; i < 10; i++) {
            System.out.println("Athlete #" + (i + 1));
            System.out.print("Last name: ");
            String lastName = scanner.next();
            System.out.print("First name: ");
            String firstName = scanner.next();
            System.out.print("Registration number: ");
            int regNumber = scanner.nextInt();
            System.out.print("Club: ");
            String club = scanner.next();
            System.out.print("Result (in seconds): ");
            double result = scanner.nextDouble();

            athletes.add(new Athlete(lastName, firstName, regNumber, club, result));
        }

        //sorting by result
        athletes.sort(Athlete::compareTo);

        //printing final protocol
        System.out.println("\nFinal protocol:");
        for (int i = 0; i < athletes.size(); i++) {
            System.out.printf("Место %d: %s%n", i + 1, athletes.get(i));
        }

    }//end of main

}//end of class
