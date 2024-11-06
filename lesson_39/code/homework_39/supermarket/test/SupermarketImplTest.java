package homework_39.supermarket.test;

import homework_39.supermarket.dao.Supermarket;
import homework_39.supermarket.dao.SupermarketImpl;
import homework_39.supermarket.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class SupermarketImplTest {

    private Supermarket supermarket;

    @BeforeEach
    public void setUp() {
        supermarket = new SupermarketImpl();

        supermarket.addProduct(new Product(1001, "Milk", "Dairy", "BrandA", 1.5, LocalDate.of(2024, 10, 20)));
        supermarket.addProduct(new Product(1002, "Bread", "Bakery", "BrandB", 1.0, LocalDate.of(2024, 11, 10)));
        supermarket.addProduct(new Product(1003, "Cheese", "Dairy", "BrandA", 3.0, LocalDate.of(2024, 10, 15)));
    }

    @Test
    public void testAddProduct_UniqueBarCode() {
        Product product = new Product(1004, "Butter", "Dairy", "BrandC", 2.5, LocalDate.of(2023, 12, 5));
        assertTrue(supermarket.addProduct(product));
        assertEquals(4, supermarket.skuQuantity());
    }

    @Test
    public void testAddProduct_DuplicateBarCode() {
        Product duplicateProduct = new Product(1001, "Yogurt", "Dairy", "BrandA", 1.8, LocalDate.of(2023, 11, 10));
        assertFalse(supermarket.addProduct(duplicateProduct));
        assertEquals(3, supermarket.skuQuantity()); // The count should remain the same
    }

    @Test
    public void testRemoveProduct() {
        assertTrue(supermarket.removeProduct(1001));
        assertEquals(2, supermarket.skuQuantity());
    }

    @Test
    public void testRemoveNonExistentProduct() {
        assertFalse(supermarket.removeProduct(9999));
        assertEquals(3, supermarket.skuQuantity()); // The count should remain the same
    }

    @Test
    public void testFindByBarCode() {
        Product product = supermarket.findByBarCode(1002);
        assertNotNull(product);
        assertEquals("Bread", product.getName());
    }

    @Test
    public void testFindByNonExistentBarCode() {
        Product product = supermarket.findByBarCode(9999);
        assertNull(product);
    }

    @Test
    public void testFindByCategory() {
        // Test finding products by category
        Iterable<Product> dairyProducts = supermarket.findByCategory("Dairy");
        Iterator<Product> iterator = dairyProducts.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("Milk", iterator.next().getName());
        assertEquals("Cheese", iterator.next().getName());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testFindByBrand() {
        Iterable<Product> brandAProducts = supermarket.findByBrand("BrandA");
        Iterator<Product> iterator = brandAProducts.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("Milk", iterator.next().getName());
        assertEquals("Cheese", iterator.next().getName());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testFindProductsWithExpiredDate() {
        Iterable<Product> expiredProducts = supermarket.findProductsWithExpiredDate();
        Iterator<Product> iterator = expiredProducts.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("Milk", iterator.next().getName());
        assertEquals("Cheese", iterator.next().getName());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testSkuQuantity() {
        // Test getting the total SKU quantity
        assertEquals(3, supermarket.skuQuantity());
    }

}//end of class
