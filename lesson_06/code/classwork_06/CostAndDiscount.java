package classwork_06;

//**Задание 5.**
//Рассчитайте величину скидки и стоимость покупки с учетом скидки по следующим правилам:
//- сумма покупки до 100 евро - скидка 0%
//- сумма покупки от 101 евро до 200 евро - скидка 2%
//- сумма покупки от 201 евро до 500 евро - скидка 5%
//- сумма покупки от 501 евро до 1000 евро - скидка 10%
//- сумма покупки от более 1000 евро - скидка 20%
//Сумма покупки вводится с клавиатуры.

import java.util.Scanner;

public class CostAndDiscount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the sum of purchase: ");
        double sumOfPurchase = scanner.nextDouble();
        double discount = 0;

        if(sumOfPurchase>0 && sumOfPurchase<=100){
            discount = 0;
        } else if (sumOfPurchase>100 && sumOfPurchase<=200){
            discount = 0.02;
        } else if (sumOfPurchase>200 && sumOfPurchase<=500){
            discount = 0.05;
        } else if (sumOfPurchase>500 && sumOfPurchase<=1000){
            discount = 0.1;
        } else if (sumOfPurchase>1000){
            discount = 0.2;
        }

        System.out.println("The procent of discount: " + discount);

    }//end of main

}//end of class
