package org.itmo.lesson4;

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
}
