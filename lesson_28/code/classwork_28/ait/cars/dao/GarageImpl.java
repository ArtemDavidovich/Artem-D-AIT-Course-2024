package classwork_28.ait.cars.dao;

import classwork_28.ait.cars.model.Car;

import java.util.function.Predicate;

public class GarageImpl implements Garage{

    private Car[] cars;
    private int size;

    public GarageImpl(int capacity){
        this.cars = new Car[capacity];
        this.size = 0;
    }

    @Override
    public boolean addCar(Car car) {
        if(car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
        cars[size++] = car;
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if(cars[i].getRegNumber().equals(regNumber)){
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        return findCarsByPredicate(car -> car.getModel().equals(model));
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        return findCarsByPredicate(car -> car.getCompany().equals(company));
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return findCarsByPredicate(car -> car.getEngine() >= min && car.getEngine() <= max);
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return findCarsByPredicate(car -> car.getColor().equals(color));
    }

    @Override
    public boolean updateCar(Car car) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printGarage() {
        for (int i = 0; i < size; i++) {
            System.out.println(cars[i]);
        }
    }

    //в этот метод передаем логическое выражение, которое будет тестировать объекты типа Car
    private Car[] findCarsByPredicate(Predicate<Car> predicate){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(cars[i])){ //объект проходит тест
                count++;
            }
        }
        //читаем массив и переносим результаты
        Car[] res = new Car[count];
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(predicate.test(cars[i])){
                res[j++] = cars[i];
            }
        }
        return res;
    }

}//end of class
