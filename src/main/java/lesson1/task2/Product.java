package lesson1.task2;

public class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return id;
    }

    public String getProductName() {
        return name;
    }
    public double getProductPrice() {
        return price;
    }

}
