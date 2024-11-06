package homework_39.supermarket.dao;

import homework_39.supermarket.model.Product;

public interface Supermarket {

    boolean addProduct(Product product);

    boolean removeProduct(long barCode);

    Product findByBarCode(long barCode);

    Iterable<Product> findByCategory(String category);

    Iterable<Product> findByBrand(String brand);

    Iterable<Product> findProductsWithExpiredDate();

    int skuQuantity();

}//end of class
