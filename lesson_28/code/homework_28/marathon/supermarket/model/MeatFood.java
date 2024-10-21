package homework_28.marathon.supermarket.model;

public class MeatFood extends Food{

    private String meatType;

    public MeatFood(double price, String name, long barCode, String expDate, String meatType) {
        super(price, name, barCode, expDate);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MeatFood{");
        sb.append("meatType='").append(meatType).append('\'');
        sb.append(", price=").append(price);
        sb.append(", name='").append(name).append('\'');
        sb.append(", barCode=").append(barCode);
        sb.append('}');
        return sb.toString();
    }
}
