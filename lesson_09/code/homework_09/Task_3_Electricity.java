package homework_09;

//Task 3. Anna uses various electrical appliances in her home.
//She has a refrigerator that consumes 150 W, and an air conditioner that consumes 2000 W.
//Anna wants to know how much she spends on electricity per month if the cost of 1 kWh is 0.15 euros.
//Questions: How much electricity do the refrigerator and air conditioner consume together per hour? (calculateHourlyConsumption)
//How much does Anna spend on electricity per month? (calculateMonthlyCost)

public class Task_3_Electricity {

    public static void main(String[] args) {

        int refrigerator = 150;
        int conditioner = 2000;
        double kWh = 1000.0; //variable for converting watts into kWh
        double refKWH = refrigerator / kWh; //consumption of electricity in kWh by refrigerator per hour
        double conKWH = conditioner / kWh; //consumption of electricity in kWh by conditioner per hour

        double costPerHour = 0.15; // 1kWh costs in euro

        double calculateHourlyConsumption = refKWH + conKWH;
        System.out.println("Refrigerator and conditioner consume " + calculateHourlyConsumption + " kWh.");

        double calculateMonthlyCost = calculateHourlyConsumption * costPerHour * 24 * 30;
        System.out.println("Anna spends " + calculateMonthlyCost + " euro on electricity per month.");

    }//end of main

}//end of class
