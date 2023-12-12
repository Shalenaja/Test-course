// Задание 1.
//В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и
//возвращает сумму с учетом скидки.
//Ваша задача - проверить этот метод с использованием библиотеки AssertJ. Если метод calculateDiscount
//получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
//Не забудьте написать тесты для проверки этого поведения.

package lesson1;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public double calculateDiscount(double purchaseAmount, int discountAmount) {
        if(purchaseAmount == 0 ||  discountAmount == 0) {
            throw new ArithmeticException("Values must be > 0");
        }
        return purchaseAmount - (purchaseAmount * discountAmount / 100);
    }
}
