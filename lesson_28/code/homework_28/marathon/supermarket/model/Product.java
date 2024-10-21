package homework_28.marathon.supermarket.model;

import java.util.Objects;

public class Product {

    protected static final long BAR_CODE_LENGTH = 13;
    protected double price;
    protected String name;
    protected final long barCode;

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = checkBarCode(barCode);
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

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public long getBarCode() {
        return barCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return barCode == product.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(barCode);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("price=").append(price);
        sb.append(", name='").append(name).append('\'');
        sb.append(", barCode=").append(barCode);
        sb.append('}');
        return sb.toString();
    }
}
