package homework_27.supermarket.dao;

import homework_27.supermarket.model.Food;
import homework_27.supermarket.model.Product;

public class SupermarketImpl implements Supermarket {

    //fields
    private Product[] products;
    private int size;

    //constructor
    public SupermarketImpl(int capacity){
        this.products = new Product[capacity];
        this.size = 0;
    }

    @Override
    public Product[] fillMarket(Product[] products) {
        int count = 0;
        for (int i = 0; i < products.length; i++) {
            if(!(products[i] == null)){
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            addProduct(products[i]);
        }
        return products;
    }

    @Override
    public boolean addProduct(Product product) {
        if(product == null) {
            return false;
        }
        if(findProduct(product.getBarCode()) != null){
            return false;
        }
        if(size == products.length){
            return false;
        }
        products[size] = product;
        size++;
        return true;
    }

    @Override
    public void printProduct() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }

    @Override
    public Product findProduct(long barCode) {
        for (int i = 0; i < size; i++) {
            if(products[i].getBarCode() == barCode){
                return products[i];
            }
        }
        return null;
    }

    @Override
    public Product[] findByExpireDate(String expDate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(products[i] instanceof Food){
                if (((Food) products[i]).getExpDate().equals(expDate)) {
                    count++;
                }
            }
        }
        Product[] tempProducts = new Product[count];
        for (int i = 0, j = 0; i < size; i++) {
            if(products[i] instanceof Food) {
                if (((Food) products[i]).getExpDate().equals(expDate)) {
                    tempProducts[j] = products[i];
                    j++;
                }
            }
        }
        if(tempProducts[0] != null){
            return tempProducts;
        }
        return null;
    }

    @Override
    public Product removeProduct(long barCode) {
        for (int i = 0; i < size; i++) {
            if(products[i].getBarCode() == barCode){
                //putting copy of last book instead of victim
                Product victim = products[i];
                products[i] = products[size - 1];
                products[size - 1] = null;
                //erasing last element of array
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public boolean updateProduct(Product product) {
        removeProduct(product.getBarCode());
        addProduct(product);
        for (int i = 0; i < size; i++) {
            if(products[i] == product){
                return true;
            }
        }
        return false;
    }

    @Override
    public double totalPrice() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            res += products[i].getPrice();
        }
        return res;
    }

    @Override
    public double averagePrice() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            res += products[i].getPrice();
        }
        res /= size;
        return res;
    }

    @Override
    public int size() {
        return size;
    }

}
