package homework_29.ait.cars.car_sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CarTest {

    Car[] cars;

    @BeforeEach
    void setUp() {

        cars = new Car[5];
        cars[0] = new Car("Model1", "Red", 20000, 2022);
        cars[1] = new Car("Model2", "Green", 12500, 2016);
        cars[2] = new Car("Model3", "Red", 9000, 2006);
        cars[3] = new Car("Model1", "Green", 15000, 2020);
        cars[4] = new Car("Model2","Blue", 10000, 2013);

    }

    @Test
    void testSortCarsByAge(){
        System.out.println("------------------List cars as is--------------------");
        testPrintCars(); //print as is

        Arrays.sort(cars); //sorting

        System.out.println("------------------List cars sorted by age--------------------");
        testPrintCars(); //print
    }

    @Test
    void testSortCarsByModel(){
        Comparator<Car> comparatorByModel = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        };
        System.out.println("------------------List cars as is--------------------");
        testPrintCars(); //print as is

        Arrays.sort(cars, comparatorByModel); //sorting

        System.out.println("------------------List cars sorted by model--------------------");
        testPrintCars(); //print
    }

    @Test
    void testSortCarsByPrice(){
        Comparator<Car> comparatorByPrice = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return Double.compare(car1.getPrice(), car2.getPrice());
            }
        };
        System.out.println("------------------List cars as is--------------------");
        testPrintCars(); //print as is

        Arrays.sort(cars, comparatorByPrice); //sorting

        System.out.println("------------------List cars sorted by price--------------------");
        testPrintCars(); //print
    }

    @Test
    void testSortCarsByColor(){
        Comparator<Car> comparatorByColor = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getColor().compareTo(car2.getColor());
            }
        };
        System.out.println("------------------List cars as is--------------------");
        testPrintCars(); //print as is

        Arrays.sort(cars, comparatorByColor); //sorting

        System.out.println("------------------List cars sorted by color--------------------");
        testPrintCars(); //print
    }

    @Test
    void testPrintCars(){
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }


}//end of class
