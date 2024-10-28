package homework_31.cars.dao;

import homework_31.cars.model.Car;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class GarageImpl implements Garage {

    private Car[] cars;
    private int size;

    public GarageImpl(int capacity) {
        this.cars = new Car[capacity];
        this.size = 0;
    }

    @Override
    public boolean addCar(Car car) {
        if (car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
        cars[size++] = car;
        return true;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {
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
    public Car[] sortCarsByModel() {
        Comparator<Car> comparatorModel = Comparator.nullsLast((c1, c2) -> c1.getModel().compareTo(c2.getModel()));
        Arrays.sort(cars, comparatorModel);
        return cars;
    }

    @Override
    public Car[] sortCarsByColor() {
        Comparator<Car> comparatorColor = Comparator.nullsLast((c1, c2) -> c1.getColor().compareTo(c2.getColor()));
        Arrays.sort(cars, comparatorColor);
        return cars;
    }

    @Override
    public Car[] sortCarsByCompany() {
        Comparator<Car> comparatorCompany = Comparator.nullsLast((c1, c2) -> c1.getCompany().compareTo(c2.getCompany()));
        Arrays.sort(cars, comparatorCompany);
        return cars;
    }

    @Override
    public Car[] sortCarsByEngine() {
        Comparator<Car> comparatorEngine = Comparator.nullsLast((c1, c2) -> Double.compare(c1.getEngine(), c2.getEngine()));
        Arrays.sort(cars, comparatorEngine);
        return cars;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {
                //putting copy of last element instead of victim
                Car victim = cars[i];
                cars[i] = cars[size - 1];
                cars[size - 1] = null;
                //erasing last element of array
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public boolean updateCar(Car car) {
        removeCar(car.getRegNumber());
        addCar(car);
        Comparator<Car> comparatorColor = Comparator.nullsLast((c1, c2) -> c1.getRegNumber().compareTo(c2.getRegNumber()));
        for (int i = 0; i < size; i++) {
            if (cars[i] == car) {
                return true;
            }
        }
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
        System.out.println("======================");
    }

    //в этот метод передаем логическое выражение, которое будет тестировать объекты типа Car
    private Car[] findCarsByPredicate(Predicate<Car> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(cars[i])) { //объект проходит тест
                count++;
            }
        }
        //читаем массив и переносим результаты
        Car[] res = new Car[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (predicate.test(cars[i])) {
                res[j++] = cars[i];
            }
        }
        return res;
    }

}//end of class
