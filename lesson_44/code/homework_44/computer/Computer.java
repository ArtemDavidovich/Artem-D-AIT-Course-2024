package homework_44.computer;

class Computer {
    private String brand;
    private String model;
    private int year;
    private double price;
    private String processor;

    public Computer(String brand, String model, int year, double price, String processor) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getProcessor() {
        return processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", processor='" + processor + '\'' +
                '}';
    }

}//end of class
