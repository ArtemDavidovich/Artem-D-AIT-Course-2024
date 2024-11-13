package homework_44.computer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComputerAppl {

    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();

        computers.add(new Computer("Dell", "XPS 13", 2021, 1200.0, "Intel Core i7"));
        computers.add(new Computer("Apple", "MacBook Pro", 2020, 2500.0, "Apple M1"));
        computers.add(new Computer("HP", "Spectre x360", 2022, 1500.0, "Intel Core i5"));
        computers.add(new Computer("Lenovo", "ThinkPad X1", 2021, 1800.0, "Intel Core i7"));
        computers.add(new Computer("Asus", "ZenBook 14", 2020, 1000.0, "AMD Ryzen 7"));
        computers.add(new Computer("Acer", "Swift 3", 2019, 800.0, "Intel Core i5"));
        computers.add(new Computer("Microsoft", "Surface Laptop 4", 2021, 2200.0, "Intel Core i7"));

        System.out.println("------ Printing computers ------");
        printComputers(computers);

        System.out.println("------ Filtering computers by price > 1000 ------");
        printComputersByPrice(computers);

        System.out.println("------ Sorting computers by year ------");
        printComputersByYear(computers);

        System.out.println("------ Filtering computers with Intel processor ------");
        printComputersByProcessor(computers);

        System.out.println("------ Calculating average price ------");
        printAveragePrice(computers);

    }//end of main

    private static void printComputers(List<Computer> computers) {
        computers.forEach(System.out::println);
    }

    private static void printComputersByPrice(List<Computer> computers) {
        computers.stream()
                .filter(computer -> computer.getPrice() > 1000)
                .toList()
                .forEach(System.out::println);
    }

    private static void printComputersByYear(List<Computer> computers) {
        computers.stream()
                .sorted(Comparator.comparingInt(Computer::getYear))
                .forEach(System.out::println);
    }

    private static void printComputersByProcessor(List<Computer> computers) {
        computers.stream()
                .filter(computer -> computer.getProcessor().contains("Intel"))
                .toList()
                .forEach(System.out::println);
    }

    private static void printAveragePrice(List<Computer> computers) {
        double averagePrice = computers.stream()
                .mapToDouble(Computer::getPrice)
                .average()
                .orElse(0.0);
        System.out.printf("Average computer price: %.2f USD\n", averagePrice);
    }

}//end of class

