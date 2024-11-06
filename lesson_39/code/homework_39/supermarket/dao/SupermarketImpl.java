package homework_39.supermarket.dao;

import homework_39.supermarket.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SupermarketImpl implements Supermarket{

    private Collection<Product> products = new ArrayList<>();

    @Override
    public boolean addProduct(Product product) {
        // Check for uniqueness of barCode
        if (findByBarCode(product.getBarCode()) != null) {
            return false;
        }
        return products.add(product);
    }

    @Override
    public boolean removeProduct(long barCode) {
        for (Product product : products) {
            if (product.getBarCode() == barCode) {
                products.remove(product);
                return true;
            }
        }
        return false;
    }

    @Override
    public Product findByBarCode(long barCode) {
        for (Product product : products) {
            if (product.getBarCode() == barCode) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        List<Product> result = new ArrayList<>();
        // Iterate through products and add to result if category matches
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                result.add(product);
            }
        }
        return result;
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        List<Product> result = new ArrayList<>();
        // Iterate through products and add to result if brand matches
        for (Product product : products) {
            if (product.getBrand().equalsIgnoreCase(brand)) {
                result.add(product);
            }
        }
        return result;
    }

    @Override
    public Iterable<Product> findProductsWithExpiredDate() {
        List<Product> expiredProducts = new ArrayList<>();
        LocalDate today = LocalDate.now();
        // Iterate through products and add to result if expired
        for (Product product : products) {
            if (product.getExpDate().isBefore(today)) {
                expiredProducts.add(product);
            }
        }
        return expiredProducts; // Return list of expired products
    }

    @Override
    public int skuQuantity() {
        return products.size(); // Return the total number of products
    }

}//end of class
