package homework_31.cars.dao;

import homework_31.cars.model.Car;

public interface Garage {

    boolean addCar(Car car);

    Car removeCar(String regNumber);

    Car findCarByRegNumber(String regNumber);

    Car[] findCarsByModel(String model);

    Car[] findCarsByCompany(String company);

    Car[] findCarsByEngine(double min, double max);

    Car[] findCarsByColor(String color);

    Car[] sortCarsByModel();

    Car[] sortCarsByColor();

    Car[] sortCarsByCompany();

    Car[] sortCarsByEngine();

    boolean updateCar(Car car);

    int size();

    void printGarage();

}
