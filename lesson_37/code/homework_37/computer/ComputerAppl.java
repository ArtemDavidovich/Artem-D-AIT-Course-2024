package homework_37.computer;

//Задача 1. На основе класса Computer:
//
//создать собственный ArrayList;+
//добавить в него не менее 6 элементов;+
//отсортировать список по бренду;
//отсортировать список по размеру RAM, затем размеру SSD при равенстве RAM;
//подсчитать общий суммарный объем и среднее значение SSD.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComputerAppl {

    public static void main(String[] args) {

        //creating ArrayList
        List<Computer> computers = new ArrayList<>();

        //adding elements
        computers.add(new Computer(1_111_111_111_110L,"i7", 8,256,"Acer",1200));
        computers.add(new Computer(1_111_111_111_111L,"i5", 16,512,"HP",1500));
        computers.add(new Computer(1_111_111_111_112L,"AMD", 8,256,"NoName",2000));
        computers.add(new Computer(1_111_111_111_113L,"M2",8,512,"MacBook",2200));
        computers.add(new Computer(1_111_111_111_114L,"M3",16,128,"MacBook Air",2500));
        computers.add(new Computer(1_111_111_111_115L,"A1",128,256,"Samsung",1300));

        //calling native sorting
        computers.sort(Computer::compareTo);

        for (Computer computer : computers) {
            System.out.println(computer);
        }

        System.out.println("======================================");

        //setting comparator by ram
        Comparator<Computer> comparatorRam = new Comparator<Computer>() {
            @Override
            public int compare(Computer o1, Computer o2) {
                return Integer.compare(o1.getRam(), o2.getRam());
            }
        };

        computers.sort(comparatorRam);

        for (Computer computer : computers) {
            System.out.println(computer);
        }

        System.out.println("======================================");

        //setting comparator by ram and ssd
        Comparator<Computer> comparatorRamSsd = new Comparator<Computer>() {
            @Override
            public int compare(Computer o1, Computer o2) {
                int res =  Integer.compare(o1.getRam(), o2.getRam());
                return res = res != 0 ? res : Integer.compare(o1.getSsd(), o2.getSsd());
            }
        };

        computers.sort(comparatorRamSsd);

        for (Computer computer : computers) {
            System.out.println(computer);
        }

        System.out.println("======================================");

        //calculating total SSD
        System.out.println("Total SSD: " + totalSsd(computers));

        System.out.println("======================================");

        //calculating average SSD
        System.out.printf("Average SSD: %.2f", averageSsd(computers));


    }//end of main

    private static int totalSsd(List<Computer> list){
        int sum = 0;
        for (Computer computer : list) {
            sum += computer.getSsd();
        }
        return sum;
    }

    private static double averageSsd(List<Computer> list){
        double sum = 0;
        for (Computer computer : list) {
            sum += computer.getSsd();
        }
        return sum / list.size();
    }

}//end of class
