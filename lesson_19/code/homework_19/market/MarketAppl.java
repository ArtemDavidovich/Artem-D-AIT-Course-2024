package homework_19.market;

//Задача 1. Создать класс Product, с полями:
//
//private double price
//private String name
//private long barCode;
//Создать класс Food расширяющий класс Product с полем private String expDate, которое хранит дату истечения срока годности. Создать класс MeatFood расширяющий класс Food с полем private String meatType, которое хранит тип мяса, из которого изготовлен продукт. Создать класс MilkFood расширяющий класс Food с полями private String milkType, private double fat, которые хранят тип молока и жирность продукта соответственно. Во всех классах переопределить метод toString. Создать класс MarketAppl и в нем метод main. В методе main создать массив в котором хранятся по одному объекту для каждого продукта. Реализовать методы:
//печатающий все продукты из массива, и
//метод возвращающий сумму цен всех продуктов.

//Задача 2. В Задаче 1 переопределить метод equals для сравнения объектов во всех классах. В классе MarketAppl создать метод принимающий баркод и возвращающий продукт с данным баркодом. В методе main вызвать новые методы. Результат их работы напечатать в консоль.

//Задача 3. (*) В классе MarketAppl создать метод печатающий в консоль все не пищевые продукты.

import homework_19.market.model.Food;
import homework_19.market.model.MeatFood;
import homework_19.market.model.MilkFood;
import homework_19.market.model.Product;

import java.util.Scanner;

import static homework_19.market.model.Product.*;

public class MarketAppl {

    public static void main(String[] args) {

        Product[] products = new Product[5];
        products[0] = new Product(10.7, "Flower", 443457023L);
        products[1] = new Food(3.5, "Beans", 445478945L, "25-11-2024");
        products[2] = new MeatFood(10.7, "Steak", 44321578L, "14-10-2024", "Beef");
        products[3] = new MilkFood(2.3, "Cheese", 441297756L, "17-10-2024", "Cow", 3.8);
        products[4] = new Product(5.0,"Bowl",4497458934L);

        //method for printing
        printProducts(products);

        System.out.println("---------------------------");

        //method for total price calculation
        System.out.print("Total price of all products is: ");
        System.out.println(totalPrice(products));

        System.out.println("---------------------------");

        //method equals
        boolean checker = products[0].equals(products[2]);
        System.out.println(checker);

        System.out.println("---------------------------");

        //method for barcode input and product output
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the barcode to find the product:");
        long searchedBarcode = scanner.nextLong();
        System.out.println(barcode(products, searchedBarcode));

        System.out.println("---------------------------");

        //method for printing all non-food products
        nonFoodProducts(products);

    }//end of main1

}//end of class
