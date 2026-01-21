package org.itmo.lesson4;

import java.util.Arrays;

class ArrayUtils {

    static boolean isSortedAsc(int[] arrayIn) {
        if (arrayIn == null || arrayIn.length == 0) {
            return false;
        }

        for (int i = 0; i < arrayIn.length - 1; i++) {
            if (arrayIn[i] > arrayIn[i + 1]) {
                return false;
            }
        }
        return true;
    }
        static void bubbleSort(int[] arrayIn) {
        if (arrayIn == null || arrayIn.length == 0) {
            return;
        }

        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn.length; j++) {
                if (arrayIn[i] < arrayIn[j]) {
                    int ai = arrayIn[i];
                    int aj = arrayIn[j];

                    arrayIn[j] = ai;
                    arrayIn[i] = aj;
                }
            }
        }
        }

    static Integer findFirstUnique(int[] arrayIn) {
        if (!isSortedAsc(arrayIn)) {
            bubbleSort(arrayIn);
        }

        System.out.println("Array: " + Arrays.toString(arrayIn));

        int length = arrayIn.length;

        if (length == 1 || arrayIn[0] != arrayIn[1]) {
            return arrayIn[0];
        }

        for (int i = 1; i < length - 1; i++) {
            int ai = arrayIn[i];
            if (ai != arrayIn[i - 1] && ai != arrayIn[i + 1]) {
                return ai;
            }
        }

        if (arrayIn[length - 1] != arrayIn[length - 2]) {
            return arrayIn[length - 1];
        }
        return null;
    }
}


