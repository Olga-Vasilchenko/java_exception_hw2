package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Task1 {
    public static void main(String[] args) {
        float number = 0;
        boolean flag = true;
        do {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите дробное число: ");
                number = in.nextFloat();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Введенное значение не является числом!");
            }
        } while (flag);
        System.out.println(number);
    }
}
