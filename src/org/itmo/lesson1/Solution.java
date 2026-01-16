package org.itmo.lesson1;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    private static String task1() {
        return "Вывод строки:\n\n" +
                "\"Я\nхорошо\nзнаю\nJava.\"";
    }

    private static String task2() {
        int z = (46 + 10) * (10 / 3);
        int x = (29) * (4) * (-15);

        return "Результаты вычислений: " +
                "\n" +
                "(46 + 10) * (10 / 3) = " +
                z +
                "\n" +
                "(29) * (4) * (-15) = " +
                x;
    }

    private static String task3() {
        int number = 10500;
        int result = (number / 10) / 10;

        return "number = 10500" + "\n" + "(number / 10) / 10 = " + result;
    }

    private static String task4() {
        double z = 3.6;
        double x = 4.1;
        double c = 5.9;
        double result = z * x * c;

        return "result = " + result;
    }

    private static String task5() {
        //Не совсем понял суть задачи, всегда ли будет 3 числа на вход?
        Scanner sc = new Scanner(System.in);
        System.out.println("Для решения задачи №5 введите три целых числа: ");
        int z = sc.nextInt();
        int x = sc.nextInt();
        int c = sc.nextInt();

        return "Введенные числа: " + "\n" + z + "\n" + x + "\n" + c;
    }

    private static String task6() {
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

        return "Введенное число = " + value + "\n" + "Результат: " + s;
    }

    static void displayResults() {
        ArrayList<String> resultList = new ArrayList<>();
        resultList.add(task1());
        resultList.add(task2());
        resultList.add(task3());
        resultList.add(task4());
        resultList.add(task5());
        resultList.add(task6());

        for (int i = 1; i <= 6; i++) {
            System.out.println("Задание" + " " + (i));
            System.out.println();
            System.out.println(resultList.get(i - 1));
            System.out.println("------------------------------------------");
        }
    }
}
