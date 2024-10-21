package homework_28.marathon.supermarket.model;

public class Food extends Product{

    private String expDate;

    public Food(double price, String name, long barCode, String expDate) {
        super(price, name, barCode);
        setExpDate(expDate);
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        if(expDate.matches("(\\d{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])")){
            this.expDate = expDate;
        } else{
            System.out.println("Error! '" + expDate + "' date is invalid. Correct format: yyyy-MM-dd");
            System.out.println("=======================");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Food{");
        sb.append("expDate='").append(expDate).append('\'');
        sb.append(", price=").append(price);
        sb.append(", name='").append(name).append('\'');
        sb.append(", barCode=").append(barCode);
        sb.append('}');
        return sb.toString();
    }
}
