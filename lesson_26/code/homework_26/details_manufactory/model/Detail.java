package homework_26.details_manufactory.model;

//ЗАДАНИЕ 1. Реализовать приложение по следующему плану:
//
//Абстрактный класс Detail (деталь) с полями: barCode: long size: double material: String vendor: String weight: double
//
//Дочерний класс Gear (шестеренка) с полями: radius: double tooth: int
//
//Дочерний класс Lever (рычаг) с полями: power: double

import java.util.Objects;

public abstract class Detail {

    //fields
    protected static final long BAR_CODE_LENGTH = 13;
    protected final long barCode; //final because the bar code doesn't change
    protected double size;
    protected String material;
    protected String vendor;
    protected double weight;

    //constructor
    public Detail(long barCode, double size, String material, String vendor, double weight) {
        this.barCode = checkIdAndCountDigit(barCode);
        this.size = size;
        this.material = material;
        this.vendor = vendor;
        this.weight = weight;
    }

    private long checkIdAndCountDigit(long barCode){
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

    //getters and setters
    public long getBarCode() {
        return barCode;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Detail detail)) return false;
        return barCode == detail.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(barCode);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Detail{");
        sb.append("barCode=").append(barCode);
        sb.append(", size=").append(size);
        sb.append(", material='").append(material).append('\'');
        sb.append(", vendor='").append(vendor).append('\'');
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

}//end of class
