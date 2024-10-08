package homework_19.market.model;

//Задача 1. Создать класс Product, с полями:
//
//private double price
//private String name
//private long barCode;
//Создать класс Food расширяющий класс Product с полем private String expDate, которое хранит дату истечения срока годности. Создать класс MeatFood расширяющий класс Food с полем private String meatType, которое хранит тип мяса, из которого изготовлен продукт. Создать класс MilkFood расширяющий класс Food с полями private String milkType, private double fat, которые хранят тип молока и жирность продукта соответственно. Во всех классах переопределить метод toString. Создать класс MarketAppl и в нем метод main. В методе main создать массив в котором хранятся по одному объекту для каждого продукта. Реализовать методы:
//печатающий все продукты из массива, и
//метод возвращающий сумму цен всех продуктов.

public class MilkFood extends Food{

    private String milkType;
    private double fat;

    public MilkFood(double price, String name, long barCode, String expDate, String milkType, double fat) {
        super(price, name, barCode, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public double getFat() {
        return fat;
    }

    @Override
    public String toString() {
        return "MilkFood{" +
                "milkType='" + milkType + '\'' +
                ", fat=" + fat +
                "} " + super.toString();
    }
}
