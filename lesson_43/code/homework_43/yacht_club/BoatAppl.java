package homework_43.yacht_club;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BoatAppl {

    public static void main(String[] args) {

        List<Boat> boats = new ArrayList<>();

        boats.add(new Boat("Beneteau", "France", 2021, 10.5, "fiberglass", 350000.0));
        boats.add(new Boat("Jeanneau", "France", 2018, 9.8, "wood", 280000.0));
        boats.add(new Boat("Sunseeker", "UK", 2019, 12.0, "metal", 500000.0));
        boats.add(new Boat("Beneteau", "France", 2020, 10.5, "fiberglass", 340000.0));
        boats.add(new Boat("Azimut", "Italy", 2019, 15.0, "metal", 750000.0));
        boats.add(new Boat("Jeanneau", "France", 2017, 8.5, "wood", 250000.0));
        boats.add(new Boat("Princess", "UK", 2021, 14.0, "fiberglass", 600000.0));

        System.out.println("------------printing boats------------");
        printBoats(boats);

        System.out.println("------------filtering boats by material------------");
        printBoatsByMaterial(boats);

        System.out.println("------------filtering boats over price------------");
        printBoatsOverPrice(boats);

        System.out.println("------------filtering boats by year range------------");
        printBoatsByYearRange(boats);

        System.out.println("------------sorting boats by descending price------------");
        printBoatsByDescendingPrice(boats);

        System.out.println("------------getting average price------------");
        printAveragePrice(boats);

        System.out.println("------------filtering by country------------");
        printBoatsByFlag(boats);

    }//end of main

    private static void printBoatsByFlag(List<Boat> boats) {
        long countBoatsByFlag = boats.stream()
                .filter(boat -> boat.getCountry().equals("France"))
                .count();
        System.out.println("There are " + countBoatsByFlag + " yachts from France. List of these yachts:");

        boats.stream()
                .filter(boat -> boat.getCountry().equals("France"))
                .toList()
                .forEach(System.out::println);
    }

    private static void printAveragePrice(List<Boat> boats) {
        double averagePrice = boats.stream()
                .mapToDouble(Boat::getPrice)
                .average()
                .orElse(0.0);
        System.out.printf("Average price is: %.2f USD\n", averagePrice);
    }

    private static void printBoatsByDescendingPrice(List<Boat> boats) {
        boats.stream()
                .sorted(Comparator.comparing(Boat::getPrice))
                .toList()
                .reversed()
                .forEach(System.out::println);
    }

    private static void printBoatsByYearRange(List<Boat> boats) {
       boats.stream()
                .filter(boat -> boat.getYear() > 2017 && boat.getYear() < 2021)
                .toList()
                .forEach(System.out::println);
    }

    private static void printBoatsOverPrice(List<Boat> boats) {
        boats.stream()
                .filter(boat -> boat.getPrice() > 350000)
                .toList()
                .forEach(System.out::println);
    }

    private static void printBoatsByMaterial(List<Boat> boats) {
        boats.stream()
                .filter(boat -> boat.getHullMaterial().equals("fiberglass"))
                .toList()
                .forEach(System.out::println);
    }

    private static void printBoats(List<Boat> boats) {
        boats.stream()
                .forEach(System.out::println);
    }

}//end of class
