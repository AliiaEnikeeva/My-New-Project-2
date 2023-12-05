//Реализовать простой калькулятор

package lesson1.task;

import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Scanner;

public class Homework4 {
    public static void Calculater() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number_a = Integer.parseInt(scanner.next());
        System.out.println("Введите вид операции (+, -, *, /):  ");
        String operation = scanner.next();
        System.out.println("Введите второе число: ");
        int number_b = Integer.parseInt(scanner.next());
        int result;
        switch (operation) {
           case "+" -> {
                result = number_a + number_b;
                System.out.println("Сумма чисел равна:" + (result));
            }
            case "-" -> {
                result = number_a - number_b;
                System.out.println("Разность чисел равна:" + (result));
            }
            case "*" -> {
                result = number_a * number_b;
                System.out.println("Произведение чисел равно:" + (result));
            }
            case "/" -> {
                result = number_a / number_b;
                
            }
        }
    }
}
