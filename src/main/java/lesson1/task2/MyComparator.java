package lesson1.task2;

import java.util.Comparator;

class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o2.getProductPrice(), o1.getProductPrice());
    }
}