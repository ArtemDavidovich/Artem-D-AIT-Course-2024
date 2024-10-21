package homework_27.computer_shop;

import homework_27.computer_shop.dao.ComputerShopImpl;
import homework_27.computer_shop.model.Computer;
import homework_27.computer_shop.model.Laptop;
import homework_27.computer_shop.model.Smartphone;

import java.util.Arrays;

public class ComputerShopAppl {

    public static void main(String[] args) {

        Computer[] computers = new Computer[6];
        computers[0] = new Computer(1_111_111_111_110L,"i7", 8,256,"Acer",1200);
        computers[1] = new Computer(1_111_111_111_111L,"i5", 16,512,"HP",1500);
        computers[2] = new Computer(1_111_111_111_112L,"AMD", 8,256,"NoName",2000, 0.3);
        computers[3] = new Laptop(1_111_111_111_113L,"M2",8,256,"MacBook",2200, 14, 1.5, 10, "blue"); //down casting
        computers[4] = new Laptop(1_111_111_111_114L,"M3",16,128,"MacBook Air",2500, 15, 1.72, 10, "red", 0.25); //down casting
        computers[5] = new Smartphone(1_111_111_111_115L,"A1",128,256,"Samsung",1300, 9, 0.4, 12, "red", 111_111_111_111_110L); //down casting

        ComputerShopImpl computerShop = new ComputerShopImpl(7);

        computerShop.fillComputerShop(computers);
        computerShop.printComputerShop();
        System.out.println(computerShop.size());
        System.out.println("===========================");

        Computer newComputer = new Smartphone(1_111_111_111_116L,"A1",128,256,"Xiaomi",1100, 9, 0.4, 12, "blue", 111_111_111_111_111L);
        computerShop.addComputer(newComputer);
        computerShop.printComputerShop();
        System.out.println(computerShop.size());
        System.out.println("===========================");

        System.out.println(computerShop.findComputer(1_111_111_111_113L));
        System.out.println("===========================");

        System.out.println(Arrays.toString(computerShop.findBlFrDiscount()));
        System.out.println("===========================");

        computerShop.removeComputer(1_111_111_111_115L);
        computerShop.printComputerShop();
        System.out.println(computerShop.size());
        System.out.println("===========================");

        Computer oneMoreComputer = new Smartphone(1_111_111_111_116L,"A1",128,256,"Xiaomi",1050, 9, 0.4, 12, "blue", 111_111_111_111_111L);
        computerShop.addComputer(oneMoreComputer);
        computerShop.printComputerShop();
        System.out.println(computerShop.size());
        System.out.println("===========================");

    }//end of main

}//end of class
