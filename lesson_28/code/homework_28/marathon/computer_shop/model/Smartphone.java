package homework_28.marathon.computer_shop.model;

public class Smartphone extends Laptop{

    private static final int IMEI_LENGTH = 15;
    private final long imei;

    public Smartphone(long barCode, String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryLife, String color, long imei, double blFrDiscount) {
        super(barCode, cpu, ram, ssd, brand, price, displaySize, weight, batteryLife, color, blFrDiscount);
        this.imei = checkImei(imei);
    }

    public Smartphone(long barCode, String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryLife, String color, long imei) {
        super(barCode, cpu, ram, ssd, brand, price, displaySize, weight, batteryLife, color);
        this.imei = imei;
    }

    private long checkImei(long imei){
        //checking validity of barcode length
        int count = 0;
        long tempImei = imei;
        while(tempImei > 0){
            count++;
            tempImei /= 10;
        }
        if (count == IMEI_LENGTH){
            return barCode;
        }
        return -1;
    }

    public long getImei() {
        return imei;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Smartphone{");
        sb.append("imei=").append(imei);
        sb.append(", barCode=").append(barCode);
        sb.append(", cpu='").append(cpu).append('\'');
        sb.append(", ram=").append(ram);
        sb.append(", ssd=").append(ssd);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
