package homework_31.cars.test;

import homework_31.cars.dao.Garage;
import homework_31.cars.dao.GarageImpl;
import homework_31.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {

    Garage garage;
    Car[] cars;
    Car car;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        cars = new Car[5];
        cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red");
        cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green");
        cars[2] = new Car("Number4", "Model1", "Company2", 1.5, "Red");
        cars[3] = new Car("Number3", "Model4", "Company2", 2.0, "Blue");

        for (int i = 0; i < 4; i++) {
            garage.addCar(cars[i]);
        }
    }

    @Test
    @DisplayName("Adding car to Garage")
    void testAddCar() {
        assertFalse(garage.addCar(null));
        assertFalse(garage.addCar(cars[1]));
        Car newCar = new Car("Number5", "Model5", "Company1", 2.0, "Red");
        assertTrue(garage.addCar(newCar));
        assertEquals(5, garage.size());
        Car oneMoreCar = new Car("Number6", "Model5", "Company1", 2.0, "Red");
        assertFalse(garage.addCar(oneMoreCar));
        garage.printGarage();
        System.out.println("======================");
    }

    @Test
    @DisplayName("Deleting car from Garage")
    void testRemoveCar() {
        //remove existing element
        assertEquals(cars[0], garage.removeCar("Number1"));
        assertEquals(3, garage.size());
        //remove absent element
        assertNull(garage.removeCar("Number9"));
    }

    @Test
    @DisplayName("Searching for exact car by registration number")
    void testFindCarByRegNumber() {
        assertEquals(cars[3], garage.findCarByRegNumber("Number3"));
    }

    @Test
    @DisplayName("Searching for cars by model")
    void testFindCarsByModel() {
        Car[] expected = {cars[0], cars[2]};
        assertArrayEquals(expected, garage.findCarsByModel("Model1"));
    }

    @Test
    @DisplayName("Searching for cars by company")
    void testFindCarsByCompany() {
        Car[] expected = {cars[2], cars[3]};
        assertArrayEquals(expected, garage.findCarsByCompany("Company2"));
    }

    @Test
    @DisplayName("Searching for cars by engine range")
    void testFindCarsByEngine() {
        Car[] expected = {cars[0], cars[2], cars[3]};
        assertArrayEquals(expected, garage.findCarsByEngine(1.5, 2.0));
    }

    @Test
    @DisplayName("Searching for cars by color")
    void testFindCarsByColor() {
        Car[] expected = {cars[0], cars[2]};
        assertArrayEquals(expected, garage.findCarsByColor("Red"));
    }

    @Test
    @DisplayName("Updating info on exact car in Garage")
    void testUpdateCar() {
        Car newCar = new Car("Number5", "Model3", "Company3", 2.5, "Yellow");
        Car oneMoreCar = new Car("Number5", "Model3", "Company3", 2.5, "Pink");
        garage.addCar(newCar);
        garage.printGarage();
        System.out.println("==============================");
        assertTrue(garage.updateCar(oneMoreCar));
        garage.printGarage();
    }

    @Test
    @DisplayName("Checking sorting by model")
    void testSortingByModel() {
        Comparator<Car> comparatorModel = Comparator.nullsLast((c1, c2) -> c1.getModel().compareTo(c2.getModel()));
        Arrays.sort(cars, comparatorModel);
        assertArrayEquals(cars, garage.sortCarsByModel());
    }

    @Test
    @DisplayName("Checking sorting by color")
    void testSortingByColor() {
        Comparator<Car> comparatorColor = Comparator.nullsLast((c1, c2) -> c1.getColor().compareTo(c2.getColor()));
        Arrays.sort(cars, comparatorColor);
        assertArrayEquals(cars, garage.sortCarsByColor());
    }

    @Test
    @DisplayName("Checking sorting by company")
    void testSortingByCompany() {
        Comparator<Car> comparatorCompany = Comparator.nullsLast((c1, c2) -> c1.getCompany().compareTo(c2.getCompany()));
        Arrays.sort(cars, comparatorCompany);
        assertArrayEquals(cars, garage.sortCarsByCompany());
    }

    @Test
    @DisplayName("Checking sorting by engine")
    void testSortingByEngine() {
        Comparator<Car> comparatorEngine = Comparator.nullsLast((c1, c2) -> Double.compare(c1.getEngine(), c2.getEngine()));
        Arrays.sort(cars, comparatorEngine);
        assertArrayEquals(cars, garage.sortCarsByEngine());
    }

    @Test
    @DisplayName("Checking actual quantity of cars in Garage")
    void testSize() {
        assertEquals(4, garage.size());
    }

    @Test
    @DisplayName("Printing Garage")
    void testPrintGarage() {
        garage.printGarage();
    }

}//end of class