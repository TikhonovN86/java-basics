package org.itmo.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    private static void task1() {
        System.out.println(
                "Вывод строки:\n" +
                        "\"Я\nхорошо\nзнаю\nJava."
        );
    }

    private static void task2() {
        double z = (46 + 10) * ((double) 10 / 3);
        double x = (double) (29) * (4) * (-15);
    }

    private static void task3() {
        int number = 10500;
        double result = (double) (number / 10) / 10;

        System.out.println(
                "result = " + result
        );
    }

    private static void task4() {
        double z = 3.6;
        double x = 4.1;
        double c = 5.9;
        double result = z * x * c;
    }

    private static void task5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Для решения задачи №5 введите три целых числа: ");
        int z = sc.nextInt();
        int x = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("---------------------------");

        System.out.println(
                "Введенные числа: " + "\n" + z + "\n" + x + "\n" + c
        );
    }

    private static void task6() {
        Scanner sc = new Scanner(System.in);
        String s;

        System.out.println("Для решения задачи №6 введите любое число: ");
        double value = sc.nextDouble();
        System.out.println("------------------------------------------");

        if (value % 2 != 0) {
            s = "Нечетное";
        } else if (value % 2 == 0 && value > 100) {
            s = "Выход за пределы диапазона";
        } else {
            s = "Четное";
        }

        System.out.println(
                "Введенное число = " + value + "\n" + "Результат: " + s
        );
    }
}
