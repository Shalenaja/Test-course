// Задание 2. (*)
//Мы хотим улучшить функциональность нашего интернет-магазина. Ваша задача - добавить два новых метода в
//класс Shop:
//●
//Метод sortProductsByPrice(), который сортирует список продуктов по стоимости.
//●
//Метод getMostExpensiveProduct(), который возвращает самый дорогой продукт.
//Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество
//продуктов, верное содержимое корзины).
//Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
//Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность
//сортировки).
//Используйте класс Product для создания экземпляров продуктов и класс Shop для написания методов
//сортировки и тестов.

package lesson1.task2;

import java.util.ArrayList;
import java.util.Collections;

public class Shop {
    String name;
    ArrayList<Product> productArray;

    public Shop(String name,  ArrayList<Product> productArray) {
        this.name = name;
        this.productArray = productArray;

    }

    private static void printArray(ArrayList<Product> productArray) {
        for(int i = 0; i <  productArray.size(); i++)
        {
            System.out.println("id:" + productArray.get(i).id + " name:" +
                    productArray.get(i).name + " price:" + productArray.get(i).price);
        }
    }

    private static void printProduct(Product product) {
        System.out.println("Самый дорогой товар: " + product.getProductName() + ", цена:" + product.getProductPrice());
    }

    public ArrayList<Product> sortProductsByPrice(ArrayList<Product> productArray) {
        Collections.sort(productArray, new MyComparator());
        return productArray;
    }

    public Product getMostExpensiveProduct(ArrayList<Product> productArray) {
       sortProductsByPrice(productArray);
       Product expensiveProduct = productArray.get(0);
       return expensiveProduct;
    }

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<Product>();
        Product p1 = new Product(1, "набор шары елочные", 250.50);
        Product p2 = new Product(2, "гирлянда", 1050);
        Product p3 = new Product(3, "дождик", 100);
        Product p4 = new Product(4, "игрушка 'снеговик'", 550);
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);

        Shop myShop = new Shop("myShop 1", products);

        printArray(myShop.sortProductsByPrice(products));
        Product maxPrice = myShop.getMostExpensiveProduct(products);
        printProduct(maxPrice);
    }
}
