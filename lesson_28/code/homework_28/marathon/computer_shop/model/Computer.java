package homework_28.marathon.computer_shop.model;

import java.util.Objects;

public class Computer {

    private final static int BAR_CODE_LENGTH = 13;
    protected final long barCode;
    protected String cpu;
    protected int ram;
    protected int ssd;
    protected String brand;
    protected double price;
    protected double blFrDiscount;

    public Computer(long barCode, String cpu, int ram, int ssd, String brand, double price) {
        this.barCode = checkBarCode(barCode);
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.price = price;
    }

    public Computer(long barCode, String cpu, int ram, int ssd, String brand, double price, double blFrDiscount) {
        this.barCode = checkBarCode(barCode);
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.price = price;
        this.blFrDiscount = blFrDiscount;
    }

    private long checkBarCode(long barCode){
        //checking validity of barcode length
        int count = 0;
        long tempBarCode = barCode;
        while(tempBarCode > 0){
            count++;
            tempBarCode /= 10;
        }
        if (count == BAR_CODE_LENGTH){
            return barCode;
        }
        return -1;
    }

    public long getBarCode() {
        return barCode;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getBlFrDiscount() {
        return blFrDiscount;
    }

    public void setBlFrDiscount(double blFrDiscount) {
        this.blFrDiscount = blFrDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return barCode == computer.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(barCode);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("barCode=").append(barCode);
        sb.append(", cpu='").append(cpu).append('\'');
        sb.append(", ram=").append(ram);
        sb.append(", ssd=").append(ssd);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
