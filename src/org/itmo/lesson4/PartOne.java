package org.itmo.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class PartOne {
    public static void main(String[] args) {
//        System.out.println("Задание 1:");
//        task1();
//        System.out.println("----------------------------");

//        System.out.println("Задание 2:");
//        task2();
//        System.out.println("----------------------------");

//        System.out.println("Задание 3:");
//        System.out.println("Результат: " + task3());
//        System.out.println("----------------------------");

//        System.out.println("Задание 4:");
//        System.out.println("Результат: " + task4());
//        System.out.println("----------------------------");

        System.out.println("Задание 5:");
        int[] firstArray = {3, -3, 7, 4, 5, 4, 3};
        int[] secondArray = {0, -3, 7, 4, 5, 4, 3};
        task5(firstArray);
        task5(secondArray);
        System.out.println("----------------------------");
    }

    static void task1() {
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
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

    static void task5(int[] arrayIn) {
        int[] array = arrayIn;
        boolean result = false;

        if (array[0] == 3 && array[array.length - 1] == 3) {
            result = true;
        }
        System.out.println("array = " + Arrays.toString(array));
        System.out.println(result);
    }


}
