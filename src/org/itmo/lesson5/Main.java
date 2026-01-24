package org.itmo.lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic\n***typesetting, " +
                "remaining essentially unchanged. " +
                "It was popularised in the 1960s with the release of Letraset sheets " +
                "containing Lorem Ipsum passages, and more recently with desktop publishing software " +
                "like Aldus PageMaker including versions of Lorem Ipsum.";

        System.out.println("Задание 1:");
        System.out.println(task1(text));;
        System.out.println("----------------------------");

        System.out.println("Задание 2:");
        String firstWord2 = "ротатор";
        String secondWord2 = "блокировка";
        System.out.println(task2(firstWord2));
        System.out.println(task2(secondWord2));
        System.out.println("----------------------------");

        System.out.println("Задание 3:");
        String text3 = "Безо всякого стеснения заявляю: эта бяка — просто бяка, " +
                "сплошная бяка, настоящая бяка и окончательная бяка!";
        System.out.println(task3(text3));
        System.out.println("----------------------------");

        System.out.println("Задание 4:");
        String textLookingFor4 = "Lorem Ipsum";
        System.out.println(task4(text, textLookingFor4));
        System.out.println("----------------------------");

        System.out.println("Задание 5:");
        String text5 = text.substring(0, text.indexOf("."));
        System.out.println(task5(text5));
        System.out.println("----------------------------");
    }

    static String task1(String strIn) {
        if (strIn == null || strIn.isEmpty()) {
            return "incorrect input data";
        }

        String formattedString = strIn
                .replaceAll("[!\"#$%&'()*+,\\-\\n./:;<=>?@\\[\\\\\\]^_`{|}~]", " ")
                .trim();

        String[] array = formattedString.split("\\s+");
        String result = "";
        int maxLength = 0;

        for (String str : array) {
            if (str.length() > maxLength) {
                result = str;
                maxLength = str.length();
            }
        }
        return result;
    }

    static boolean task2(String strIn) {
        if (strIn == null || strIn.isEmpty()) {
            return false;
        }

        String str = strIn.toLowerCase();
        int first = 0;
        int last = str.length() - 1;

        while (first < last) {
            if (str.charAt(first) != str.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

    static String task3(String strIn) {
        if (strIn == null || strIn.isEmpty()) {
            return "incorrect input data";
        }
        return strIn.replaceAll("(?i)\\bбяк[а-яё]*\\b", "[вырезано цензурой]");
    }

    static int task4(String text, String substring) {
        if (text == null || substring == null || text.isEmpty() || substring.isEmpty()) {
            return 0;
        }

        int count = 0;
        int startIndex = 0;
        while ((startIndex = text.indexOf(substring, startIndex)) != -1) {
            count++;
            startIndex += substring.length();
        }
        return count;
    }

    static String task5(String strIn) {
        if (strIn == null || strIn.isEmpty()) {
            return "incorrect input data";
        }

        String[] array = strIn.split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = new StringBuilder(array[i]).reverse().toString();
        }

        return String.join(" ", array);
    }
}
