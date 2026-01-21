package org.itmo.lesson4;

import java.util.Arrays;
import java.util.Scanner;

import static org.itmo.lesson4.ArrayUtils.*;

public class PartTwo {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        int[] firstArray1 = {2, 2, 4, 4, 100};
        int[] secondArray1 = {1, 2, 32, 100, 200, 1};
        task1(firstArray1);
        task1(secondArray1);
        System.out.println("----------------------------");

        System.out.println("Задание 2:");
        task2();
        System.out.println("----------------------------");

        System.out.println("Задание 3:");
        int[] firstArray3 = {5, 2, 4, 4, 100};
        task3(firstArray3);
        System.out.println("----------------------------");

        System.out.println("Задание 4:");
        int[] firstArray4 = {12, 4, 7, 1, 12, 4, 1};
        int[] secondArray4 = {1, 2, 21, 5, 2, 5};
        int[] thirdArray4 = {1, 3, 2, 1, 1};
        System.out.println("Первое уникальное число: " + task4(firstArray4));
        System.out.println("Первое уникальное число: " + task4(secondArray4));
        System.out.println("Первое уникальное число: " + task4(thirdArray4));
        System.out.println("----------------------------");
    }

    static void task1(int[] arrayIn) {
        System.out.println("Array = " + Arrays.toString(arrayIn));
        if (isSortedAsc(arrayIn)) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    static void task2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array length: ");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];

        System.out.println("Numbers of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Result: " + Arrays.toString(array));
    }

    static void task3(int[] arrayIn) {
        if (arrayIn == null || arrayIn.length == 0) {
            System.out.println("incorrect input data");
            return;
        }

        System.out.println("Array 1: " + Arrays.toString(arrayIn));

        int firstValue = arrayIn[0];
        int lastValue = arrayIn[arrayIn.length - 1];
        arrayIn[0] = lastValue;
        arrayIn[arrayIn.length - 1] = firstValue;

        System.out.println("Array 2: " + Arrays.toString(arrayIn));
    }

    static Integer task4(int[] arrayIn) {
        return findFirstUnique(arrayIn);
    }

    /*
    Не понял из условия задачи, можем ли мы отсортировать массив перед поиском или нет.
    Ниже представлен метод, по которому можно найти первое уникальное значение в неотсортированном массиве,
    но т.к. не понятно, где он может применяться, активным оставил первый метод для поиска;
     */
//        static Integer task4(int[] arrayIn) {
//        System.out.println("Array: " + Arrays.toString(arrayIn));
//        if (arrayIn == null || arrayIn.length == 0) {
//            return null;
//        }
//
//        Integer result = null;
//        boolean found = false;
//        int length = arrayIn.length;
//
//        for (int i = 0; i < length && !found; i++) {
//            int ai = arrayIn[i];
//            for (int j = 0; j < length; j++) {
//                int aj = arrayIn[j];
//
//                if (ai == aj && i != j) {
//                    break;
//                }
//
//                if (j == length - 1) {
//                    result = ai;
//                    found = true;
//                    break;
//                }
//            }
//        }
//        return result;
//    }
}
