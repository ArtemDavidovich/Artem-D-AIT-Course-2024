package classwork_18.computer_shop;

//Создать несколько экземпляров каждого класса.
//
//Какой общий объем памяти у всех устройств на складе?
//Какова общая стоимость всех устройств на складе?

import classwork_18.computer_shop.model.Computer;
import classwork_18.computer_shop.model.Laptop;
import classwork_18.computer_shop.model.Smartphone;

public class ShopAppl {

    public static void main(String[] args) {

        Computer computer = new Computer("i7", 8,256,"Acer",1200);
        System.out.println(computer);

        Laptop laptop = new Laptop("M2",8,256,"Apple AirBook",2200, 14, 1.5, 10, "blue");
        System.out.println(laptop);

        Computer[] computers = new Computer[6];
        computers[0] = new Computer("i7", 8,256,"Acer",1200);
        computers[1] = new Computer("i5", 16,512,"HP",1500);
        computers[2] = new Computer("AMD", 8,256,"NoName",2000);
        computers[3] = new Laptop("M2",8,256,"MacBook",2200, 14, 1.5, 10, "blue"); //down casting
        computers[4] = new Laptop("M3",16,128,"MacBook Air",2500, 15, 1.72, 10, "red"); //down casting
        computers[5] = new Smartphone("A1",128,256,"Samsung",1300, 9, 0.4, 12, "red", 17445875294635L); //down casting

        int totalSsd = 0;
        double totalPrice = 0;
        double totalWeight = 0;

        for (int i = 0; i < computers.length; i++) {
            totalSsd += computers[i].getSsd();
        }

        for (int i = 0; i < computers.length; i++) {
            totalPrice += computers[i].getPrice();
        }

        for (int i = 0; i < computers.length; i++) {
            if(computers[i] instanceof Laptop) {
                totalWeight += ((Laptop) computers[i]).getWeight(); // upper casting
            }
        }

        System.out.println("Total SSD: " + totalSsd);
        System.out.println("Total price: " + totalPrice);
        System.out.println("Total weight: " + totalWeight);

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i]);
        }

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].getBrand());
        }

        System.out.println("____________________________________");

        System.out.println(computers[5]);

    }//end of main

}//end of class
