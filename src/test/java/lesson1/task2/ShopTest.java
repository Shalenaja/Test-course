package lesson1.task2;

import java.util.ArrayList;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {
    private Shop myShop;
    ArrayList<Product> products;

    @BeforeAll
    static void setup() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void init() {
        products = new ArrayList<Product>();
        Product p1 = new Product(1, "набор шары елочные", 250.50);
        Product p2 = new Product(2, "гирлянда", 1050);
        Product p3 = new Product(3, "дождик", 100);
        Product p4 = new Product(4, "игрушка 'снеговик'", 550);
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        myShop = new Shop("myShop 1", products);
    }

    @AfterAll
    static void teardown() {
        System.out.println("After all tests");
    }

    @Test
    @DisplayName("Test sortProductsByPrice")
    void testSortProductsByPrice() {
        double result = myShop.sortProductsByPrice(products).get(0).price;
        assertEquals(1050.0, result, "max equal 1050.0");
    }

    @Test
    @DisplayName("Test getMostExpensiveProduct")
    void  testGetMostExpensiveProduct() {
       double result = myShop.getMostExpensiveProduct(products).getProductPrice();
       assertEquals(1050.0, result, "max price equal 1050.0");
    }
}