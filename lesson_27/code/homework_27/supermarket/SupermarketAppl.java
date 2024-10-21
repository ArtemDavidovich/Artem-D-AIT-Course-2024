package homework_27.supermarket;

import homework_27.supermarket.dao.SupermarketImpl;
import homework_27.supermarket.model.Food;
import homework_27.supermarket.model.MeatFood;
import homework_27.supermarket.model.MilkFood;
import homework_27.supermarket.model.Product;

import java.util.Arrays;

public class SupermarketAppl {

    public static void main(String[] args) {

        Product[] products = new Product[5];
        products[0] = new Product(10.7, "Flower", 1_111_111_111_110L);
        products[1] = new Food(3.5, "Beans", 1_111_111_111_111L, "2024-11-25");
        products[2] = new MeatFood(10.7, "Steak", 1_111_111_111_112L, "2024-10-14", "Beef");
        products[3] = new MilkFood(2.3, "Cheese", 1_111_111_111_113L, "2024-10-14", "Cow", 3.8);
        products[4] = new Product(5.0,"Bowl",1_111_111_111_114L);

        SupermarketImpl supermarket = new SupermarketImpl(6);

        supermarket.fillMarket(products);
        supermarket.printProduct();
        System.out.println(supermarket.size());
        System.out.println("===========================");

        Product newProduct = new Product(2.4, "Pen", 1_111_111_111_115L);
        supermarket.addProduct(newProduct);
        supermarket.printProduct();
        System.out.println(supermarket.size());
        System.out.println("===========================");

        System.out.println(supermarket.findProduct(1_111_111_111_115L));
        System.out.println("===========================");

        System.out.println(Arrays.toString(supermarket.findByExpireDate("2024-10-14")));
        System.out.println("===========================");

        supermarket.removeProduct(1_111_111_111_115L);
        supermarket.printProduct();
        System.out.println(supermarket.size());
        System.out.println("===========================");

        Product oneMoreProduct = new Product(5.5, "Bowl", 1_111_111_111_114L);
        supermarket.addProduct(oneMoreProduct);
        supermarket.printProduct();
        System.out.println(supermarket.size());
        System.out.println("===========================");

        System.out.println("Total price of goods is: " + supermarket.totalPrice());
        System.out.println("===========================");

        System.out.println("Average price of goods is: " + supermarket.averagePrice());
        System.out.println("===========================");

    }//end of main1

}//end of class
