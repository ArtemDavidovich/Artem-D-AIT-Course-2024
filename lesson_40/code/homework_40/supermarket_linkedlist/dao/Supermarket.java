package homework_40.supermarket_linkedlist.dao;

import homework_40.supermarket_linkedlist.model.Product;

import java.util.Iterator;

public interface Supermarket {

    boolean addProduct(Product product);
    Product removeProduct(long barCode);
    Product findByBarCode(long barCode);
    Iterable<Product> findByCategory(String category);
    Iterable<Product> findByBrand(String brand);
    Iterable<Product> findProductsWithExpiredDate();
    int skuQuantity();
    Iterator<Product> iterator();

}
