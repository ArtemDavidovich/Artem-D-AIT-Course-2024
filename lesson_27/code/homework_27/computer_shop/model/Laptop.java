package homework_27.computer_shop.model;

public class Laptop extends Computer{

    private double displaySize;
    private double weight;
    private int batteryLife;
    private String color;

    public Laptop(long barCode, String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryLife, String color, double blFrDiscount) {
        super(barCode, cpu, ram, ssd, brand, price, blFrDiscount);
        this.displaySize = displaySize;
        this.weight = weight;
        this.batteryLife = batteryLife;
        this.color = color;
    }

    public Laptop(long barCode, String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryLife, String color) {
        super(barCode, cpu, ram, ssd, brand, price);
        this.displaySize = displaySize;
        this.weight = weight;
        this.batteryLife = batteryLife;
        this.color = color;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Laptop{");
        sb.append("displaySize=").append(displaySize);
        sb.append(", weight=").append(weight);
        sb.append(", batteryLife=").append(batteryLife);
        sb.append(", color='").append(color).append('\'');
        sb.append(", barCode=").append(barCode);
        sb.append(", cpu='").append(cpu).append('\'');
        sb.append(", ram=").append(ram);
        sb.append(", ssd=").append(ssd);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}//end of class

