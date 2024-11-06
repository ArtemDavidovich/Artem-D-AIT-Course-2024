package homework_39.supermarket.model;

//Задача 3(*). Реализуйте приложение SuperMarket согласно UML-схеме:
//
//класс Product
//интерфейс Supermarket
//тест (набор продуктов и стандартный набор тестов к методам из интерфейса)

import java.time.LocalDate;
import java.util.Objects;

public class Product {

    private long barCode;
    private String name;
    private String category;
    private String brand;
    private double price;
    private LocalDate expDate;

    public Product(long barCode, String name, String category, String brand, double price, LocalDate expDate) {
        this.barCode = barCode;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.expDate = expDate;
    }

    public long getBarCode() { return barCode; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getBrand() { return brand; }
    public double getPrice() { return price; }
    public LocalDate getExpDate() { return expDate; }

    public void setPrice(double price) { this.price = price; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return barCode == product.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCode);
    }

    // toString method
    @Override
    public String toString() {
        return "Product{" +
                "barCode=" + barCode +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", expDate=" + expDate +
                '}';
    }

}//end of class
