package org.example;

import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task4 {
    public static void main(String[] args) {
        String string = null;
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите строку: ");
            string = in.nextLine();
            if (string == "") {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("Нельзя вводить пустые строки!");
        }
        System.out.println("Вы ввели следующее -> " + string);
    }
}
