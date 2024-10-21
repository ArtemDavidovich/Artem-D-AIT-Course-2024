package homework_28.marathon.supermarket.test;

import homework_28.marathon.supermarket.dao.Supermarket;
import homework_28.marathon.supermarket.dao.SupermarketImpl;
import homework_28.marathon.supermarket.model.Food;
import homework_28.marathon.supermarket.model.MeatFood;
import homework_28.marathon.supermarket.model.MilkFood;
import homework_28.marathon.supermarket.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketImplTest {

    Supermarket supermarket;
    Product[] products;

    @BeforeEach
    void setUp() {
        supermarket = new SupermarketImpl(6);
        products = new Product[5];
        products[0] = new Product(10.7, "Flower", 1_111_111_111_110L);
        products[1] = new Food(3.5, "Beans", 1_111_111_111_111L, "2024-11-25");
        products[2] = new MeatFood(10.7, "Steak", 1_111_111_111_112L, "2024-10-14", "Beef");
        products[3] = new MilkFood(2.3, "Cheese", 1_111_111_111_113L, "2024-10-14", "Cow", 3.8);
        products[4] = new Product(5.0,"Bowl",1_111_111_111_114L);

        supermarket.fillMarket(products);
    }

    @Test
    @DisplayName("Filling Supermarket with products")
    void fillMarketTest() {
        assertEquals(products, supermarket.fillMarket(products));
    }

    @Test
    @DisplayName("Adding product to Supermarket")
    void addProductTest() {
        //no null adding
        assertFalse(supermarket.addProduct(null));
        //no duplicate adding
        assertFalse(supermarket.addProduct(products[0]));
        //adding new product
        Product newProduct = new Product(2.4, "Pen", 1_111_111_111_115L);
        assertTrue(supermarket.addProduct(newProduct));
        assertEquals(6,supermarket.size());
        //adding one more product over capacity
        Product oneMoreProduct = new Product(2,"Paper",1_111_111_111_116L);
        assertFalse(supermarket.addProduct(oneMoreProduct));
    }

    @Test
    @DisplayName("Printing Supermarket")
    void printProductTest() {
        supermarket.printProduct();
        System.out.println("=============================");
    }

    @Test
    @DisplayName("Searching for exact product by its bar code")
    void findProductTest() {
        assertEquals(products[0], supermarket.findProduct(1_111_111_111_110L));
        assertNull(supermarket.findProduct(1_111_111_111_119L));
    }

    @Test
    @DisplayName("Searching for products by expire date")
    void findByExpireDateTest() {
        Product[] tempProducts = new Product[2];
        tempProducts[0] = new MeatFood(10.7, "Steak", 1_111_111_111_112L, "2024-10-14", "Beef");
        tempProducts[1] = new MilkFood(2.3, "Cheese", 1_111_111_111_113L, "2024-10-14", "Cow", 3.8);
        assertArrayEquals(tempProducts, supermarket.findByExpireDate("2024-10-14"));
    }

    @Test
    @DisplayName("Deleting product from Supermarket")
    void removeProductTest() {
        //remove existing element
        assertEquals(products[0], supermarket.removeProduct(1_111_111_111_110L));
        assertEquals(4, supermarket.size());
        //remove absent element
        assertNull(supermarket.removeProduct(1_111_111_111_119L));
    }

    @Test
    @DisplayName("Updating product in Supermarket")
    void updateProductTest() {
        Product newProduct = new Product(10.7, "Soap", 1_111_111_111_115L);
        Product oneMoreProduct = new Product(9.5,"Soap",1_111_111_111_115L);
        supermarket.addProduct(newProduct);
        supermarket.printProduct();
        System.out.println("==============================");
        assertTrue(supermarket.updateProduct(oneMoreProduct));
        supermarket.printProduct();
    }

    @Test
    @DisplayName("Calculating total price of products in Supermarket")
    void totalPriceTest() {
        double res = 0;
        for(Product product : products){
            res += product.getPrice();
        }
        assertEquals(res, supermarket.totalPrice());
    }

    @Test
    @DisplayName("Calculating average price of products in Supermarket")
    void averagePriceTest() {
        double res = 0;
        for(Product product : products){
            res += product.getPrice();
        }
        res /= products.length;
        assertEquals(res, supermarket.averagePrice());
    }

    @Test
    @DisplayName("Checking actual quantity of products in Supermarket")
    void sizeTest() {
        assertEquals(5, supermarket.size());
    }
}