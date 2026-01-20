package org.itmo.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class PartOne {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        task1();
        System.out.println("----------------------------");

        System.out.println("Задание 2:");
        task2();
        System.out.println("----------------------------");

        System.out.println("Задание 3:");
        System.out.println("Результат: " + task3());
        System.out.println("----------------------------");

        System.out.println("Задание 4:");
        System.out.println("Результат: " + task4());
        System.out.println("----------------------------");

        System.out.println("Задание 5:");
        int[] firstArray5 = {3};
        int[] secondArray5 = {0, -3, 3, 3, 3, 4, 1};
        int[] thirdArray5 = {0, -3, 7, 4, 5, 4, 3};
        int[] fourthArray5 = {3, -3, 7, 4, 5, 4, 0};
        System.out.println(task5(firstArray5));
        System.out.println(task5(secondArray5));
        System.out.println(task5(thirdArray5));
        System.out.println(task5(fourthArray5));
        System.out.println("----------------------------");

        System.out.println("Задание 6:");
        int[] firstArray2 = {3, -3, 7, 4, 5, 4, 3};
        int[] secondArray2 = {1, -5, 1, 4, 1, 4, 100};
        int[] thirdArray2 = {44, -5, 13, 4, 21, 4, 100};
        task6(firstArray2);
        task6(secondArray2);
        task6(thirdArray2);
        System.out.println("----------------------------");
    }

    static void task1() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
    }

    static void task2() {
        for (int i = 1; i < 101; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("Делится на 3 и на 5: " + i);
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Делится на 3: " + i);
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Делится на 5: " + i);
            }
        }
    }

    static boolean task3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNum = sc.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = sc.nextInt();
        System.out.print("Введите третье число: ");
        int thirdNum = sc.nextInt();

        if (firstNum + secondNum == thirdNum) {
            return true;
        }
        return false;
    }

    static boolean task4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNum = sc.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = sc.nextInt();
        System.out.print("Введите третье число: ");
        int thirdNum = sc.nextInt();

        if (secondNum > firstNum && thirdNum > secondNum) {
            return true;
        }
        return false;
    }

    static boolean task5(int[] arrayIn) {
        System.out.println("Array = " + Arrays.toString(arrayIn));
        if (arrayIn == null || arrayIn.length < 2) {
            return false;
        }

        int length = arrayIn.length;

        if (arrayIn[0] == 3 || arrayIn[length - 1] == 3) {
            return true;
        } else {
            return false;
        }

    }

    static void task6(int[] arrayIn) {
        System.out.println("Array = " + Arrays.toString(arrayIn));
        for (int elem : arrayIn) {
            if (elem == 1) {
                System.out.println("Массив содержит число 1");
                return;
            } else if (elem == 3) {
                System.out.println("Массив содержит число 3");
                return;
            }
        }
        System.out.println("Массив не содержит число 1 или 3");
    }
}
