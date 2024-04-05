package org.example;

/**
 * Дан следующий код, исправьте его там, где требуется (задание 3).
 * Добавила исключение при делении на ноль ArithmeticException;
 * Заменила Throwable на Exception;
 * Убрала из метода printSum исключение FileNotFoundException, так как с файлами не работаем.
 */
public class Task3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя!");
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
