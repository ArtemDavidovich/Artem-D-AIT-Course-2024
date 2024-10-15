package homework_23.vacation_car.model;

//Задача 2. Семья планирует поехать в отпуск в Италию из Германии и покрыть порядка 3000 км. Имеется информация о 5 автомобилях на жидком топливе (бензин или дизтопливо):
//
//марка автомобиля: Audi, BMW, Opel, VW, Mercedes.
//тип расходуемого топлива: d, b, d, d, b
//стоимость 1 литра топлива: d - 1.6, b - 1.8
//расход на 100 км пути: 6.6, 6.8, 6.9, 6.5, 6.3
//стоимость недельной аренды автомобиля: 45, 49, 45, 39, 49 Какой автомобиль ей следует выбрать, исходя из минимальной стоимости?

public class VacationCar {

    private String brand; //brand of auto
    private String fuel; //type of fuel
    private double costOfFuel; //cost of 1 liter of fuel
    private double consPerHundred; //consumption of fuel per hundred kilometers
    private int costOfRent; //cost of 1 rent week and we assume that they will have a two-week vacation

    public static final double D_COST = 1.6; //diesel price per 1 kilometer
    public static final double B_COST = 1.8; //petrol price per 1 kilometer
    public static final int DISTANCE = 30; //preventive divided by 100, while we already have consumption of fuel per 100 km

    //constructor
    public VacationCar(String brand, String fuel, double consPerHundred, int costOfRent) {
        this.brand = brand;
        this.fuel = fuel;

        //set the cost of fuel based on fuel type
        if(fuel.equals("d")){
            costOfFuel = D_COST;
        } else {
            costOfFuel = B_COST;
        }

        this.consPerHundred = consPerHundred;
        this.costOfRent = costOfRent;
    }

    //getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getConsPerHundred() {
        return consPerHundred;
    }

    public void setConsPerHundred(double consPerHundred) {
        this.consPerHundred = consPerHundred;
    }

    public int getCostOfRent() {
        return costOfRent;
    }

    public void setCostOfRent(int costOfRent) {
        this.costOfRent = costOfRent;
    }

    //display
    @Override
    public String toString() {
        return "VacationCar{" +
                "brand='" + brand + '\'' +
                ", fuel='" + fuel + '\'' +
                ", costOfFuel=" + costOfFuel +
                ", consPerHundred=" + consPerHundred +
                ", costOfRent=" + costOfRent +
                '}';
    }

    //methods
    public static double[] vacationCarTotalPrice(VacationCar[] vacationCars){
        double[] vacationCarTotalPrice = new double[vacationCars.length];
        for (int i = 0, j = 0; i < vacationCars.length; i++, j++) {
            vacationCarTotalPrice[j] = DISTANCE * vacationCars[i].consPerHundred * vacationCars[i].costOfFuel + vacationCars[i].costOfRent * 2;
        }
        return vacationCarTotalPrice;
    }

    public static VacationCar vacationCarBestChoice(VacationCar[] vacationCars){
        double[] vacationCarBestChoice = vacationCarTotalPrice(vacationCars);
        double minPrice = vacationCarBestChoice[0];
        int minIndex = 0;
        for (int i = 0; i < vacationCarBestChoice.length; i++) {
            if(vacationCarBestChoice[i] < minPrice){
                minPrice = vacationCarBestChoice[i];
                minIndex = i;
            }
        }
        System.out.println("Total cost of the trip is: " + minPrice + ".");
        return vacationCars[minIndex];
    }

}
