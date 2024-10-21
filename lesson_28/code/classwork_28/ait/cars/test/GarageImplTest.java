package classwork_28.ait.cars.test;

import classwork_28.ait.cars.dao.Garage;
import classwork_28.ait.cars.dao.GarageImpl;
import classwork_28.ait.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {

    Garage garage;
    Car[] cars;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        cars = new Car[4];
        cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red");
        cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green");
        cars[2] = new Car("Number3", "Model1", "Company2", 1.5, "Red");
        cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green");

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
    }

    @Test
    @DisplayName("Searching for exact car by registration number")
    void testFindCarByRegNumber() {
        assertEquals(cars[2], garage.findCarByRegNumber("Number3"));
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
        Car[] expected = {cars[1], cars[3]};
        assertArrayEquals(expected, garage.findCarsByColor("Green"));
    }

    @Test
    @DisplayName("Updating exact car in Garage")
    void testUpdateCar() {
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

}