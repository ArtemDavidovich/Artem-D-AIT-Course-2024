package homework_29.ait.cars.car_sorting;

import java.util.Objects;

public class Car implements Comparable<Car>{

    private String model;
    private String color;
    private double price;
    private int yearOfProduction;

    public Car(String model, String color, double price, int yearOfProduction) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public int compareTo(Car car) {
        return this.yearOfProduction - car.getYearOfProduction();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Double.compare(price, car.price) == 0 && yearOfProduction == car.yearOfProduction && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, price, yearOfProduction);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("model='").append(model).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", price=").append(price);
        sb.append(", yearOfProduction=").append(yearOfProduction);
        sb.append('}');
        return sb.toString();
    }


}//end of class
