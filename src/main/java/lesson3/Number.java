// Задание 1.
//Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число четным или нечетным.

//Задание 2.
//Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли переданное число в интервал (25;100).

package lesson3;

public class Number {

// task 1
    public static boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

// task 2
    public static boolean numberInInterval(int n) {
        if (n >= 25 && n <= 100) {
            return true;
        } else {
            return false;
        }
    }
  }
