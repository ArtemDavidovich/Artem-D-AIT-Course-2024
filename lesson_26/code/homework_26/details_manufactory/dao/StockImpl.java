package homework_26.details_manufactory.dao;

//StockImpl
//
//унаследовать методы из интерфейса Stock

import homework_26.details_manufactory.model.Detail;

public class StockImpl implements Stock{

    private Detail[] details;
    private int quantity; //not to be confused, because we already have size as details parameter

    //capacity
    public StockImpl(int capacity){
        this.details = new Detail[capacity];
        this.quantity = quantity;
    }

    @Override
    public boolean addDetail(Detail detail) {
        return false;
    }

    @Override
    public Detail findDetail(long barCode) {
        return null;
    }

    @Override
    public Detail updateDetail(Detail detail, long barCode) {
        return null;
    }

    @Override
    public Detail removeDetail(long barCode) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public double totalWeight(Detail[] details) {
        return 0;
    }

    @Override
    public double averageWeight(Detail[] details) {
        return 0;
    }

}//end of class
