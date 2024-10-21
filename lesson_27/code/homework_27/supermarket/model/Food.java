package homework_27.supermarket.model;

//Задача 1. Создать класс Product, с полями:
//
//private double price
//private String name
//private long barCode;
//Создать класс Food расширяющий класс Product с полем private String expDate, которое хранит дату истечения срока годности. Создать класс MeatFood расширяющий класс Food с полем private String meatType, которое хранит тип мяса, из которого изготовлен продукт. Создать класс MilkFood расширяющий класс Food с полями private String milkType, private double fat, которые хранят тип молока и жирность продукта соответственно. Во всех классах переопределить метод toString. Создать класс MarketAppl и в нем метод main. В методе main создать массив в котором хранятся по одному объекту для каждого продукта. Реализовать методы:
//печатающий все продукты из массива, и
//метод возвращающий сумму цен всех продуктов.

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
