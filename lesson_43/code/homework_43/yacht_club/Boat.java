package homework_43.yacht_club;

public class Boat {

    private String manufacturer;
    private String country;
    private int year;
    private double length;
    private String hullMaterial;
    private double price;

    public Boat(String manufacturer, String country, int year, double length, String hullMaterial, double price) {
        this.manufacturer = manufacturer;
        this.country = country;
        this.year = year;
        this.length = length;
        this.hullMaterial = hullMaterial;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getHullMaterial() {
        return hullMaterial;
    }

    public void setHullMaterial(String hullMaterial) {
        this.hullMaterial = hullMaterial;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Boat {" +
                "Manufacturer='" + manufacturer + '\'' +
                ", Country='" + country + '\'' +
                ", Year=" + year +
                ", Length=" + length + " meters" +
                ", Hull Material='" + hullMaterial + '\'' +
                ", Price=" + price + " USD" +
                '}';
    }

}//end of class
