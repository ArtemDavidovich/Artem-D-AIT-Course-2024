package classwork_28.ait.cars.dao;

import classwork_28.ait.cars.model.Car;

public interface Garage {

    boolean addCar(Car car);

    Car removeCar(String regNumber);

    Car findCarByRegNumber(String regNumber);

    Car[] findCarsByModel(String model);

    Car[] findCarsByCompany(String company);

    Car[] findCarsByEngine(double min, double max);

    Car[] findCarsByColor(String color);

    boolean updateCar(Car car);

    int size();

    void printGarage();

}
