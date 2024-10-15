package homework_23.vacation_car.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VacationCarTest {

    VacationCar[] vacationCars;

    @BeforeEach
    void setUp() {
        vacationCars = new VacationCar[5];
        vacationCars[0] = new VacationCar("Audi","d",6.6,45);
        vacationCars[1] = new VacationCar("BMW","b",6.8,49);
        vacationCars[2] = new VacationCar("Opel","d",6.9,45);
        vacationCars[3] = new VacationCar("VW","d",6.5,39);
        vacationCars[4] = new VacationCar("Mercedes","b",6.3,49);
    }

    @Test
    @DisplayName("Defining the cheapest car")
    void testCheapestCar(){
        String expectedAuto = "VW";
        VacationCar cheapestCar = VacationCar.vacationCarBestChoice(vacationCars);
        assertEquals(expectedAuto, cheapestCar.getBrand(), expectedAuto + " is not the cheapest variant.");
    }
}