package homework_05;

//Task 3. Calculate the purchase of discounted items.
// Product A costs X euros and has a D% discount, and product B costs Y euros and has a C% discount.
// The client took N goods A and M goods B. If the purchase amount exceeds 100 euros, then an additional 5% discount is granted.
// Calculate the total cost of the purchase and the amount of the discount received.

public class Task_3 {

    public static void main(String[] args) {

        double a = 13.7; //the cost of product A, euro
        double b = 24.6; //the cost of product B, euro
        double c = 0.1; //the discount on product B
        double d = 0.15; //the discount on product A
        double x = 0.05; //the amount of extra discount
        int n = 4; //the amount of product A
        int m = 5; //the amount of product B

        double totalCostFormula = n*a*(1-d) + m*b*(1-c); //the formula for total cost of purchase
        double totalCost = 0; //total cost of the purchase
        double extraDiscount = 0; //the amount of extra discount
        double totalDiscount = n*a*d + m*b*c + extraDiscount; //the total amount of discount

        if(totalCostFormula > 100){
            totalCost = (totalCostFormula) * (1-x);
            extraDiscount = (totalCostFormula) * x;
        } else{
            totalCost = totalCostFormula;
        }

        System.out.println("The total cost of the products is: " + totalCost + " euro.\nThe amount of extra discount is: " + extraDiscount + " euro.\nThe total amount of discount is: " + totalDiscount + " euro.");

    } //end of main

}//end of class
