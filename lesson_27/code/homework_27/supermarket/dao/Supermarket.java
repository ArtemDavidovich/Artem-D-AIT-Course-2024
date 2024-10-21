package homework_27.supermarket.dao;

import homework_27.supermarket.model.Product;

public interface Supermarket {

    Product[] fillMarket(Product[] products);

    boolean addProduct(Product product);

    void printProduct();

    Product findProduct(long barCode);

    Product[] findByExpireDate(String expDate);

    Product removeProduct(long barCode);

    boolean updateProduct(Product product);

    double totalPrice();

    double averagePrice();

    int size();

}
