package org.example;

/**
 * Если необходимо, исправьте данный код (задание 2)
 * В задании отсутствует массив intArray.
 * Добавляем массив минимум из 9 элементов, так как код запрашивает деление индекса [8] на значение d.
 * Естественно выскакивает ошибка, так как d = 0, а на 0 делить нельзя.
 */
public class Task2 {
    public static void main(String[] args) {
        try {
            int[] intArray = {1, 3, 5, 7, 8, 9, 8, 4, 10};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}