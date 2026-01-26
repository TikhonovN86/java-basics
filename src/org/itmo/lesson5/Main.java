package org.itmo.lesson5;

import java.util.regex.Pattern;

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
        System.out.println(findLongestWord(text));
        System.out.println("----------------------------");

        System.out.println("Задание 2:");
        String firstWord2 = "ротатор";
        String secondWord2 = "блокировка";
        System.out.println(checkPalindrome(firstWord2));
        System.out.println(checkPalindrome(secondWord2));
        System.out.println("----------------------------");

        System.out.println("Задание 3:");
        String text3 = "Безо всякого стеснения заявляю: эта бяка — просто бяка, " +
                "сплошная бяка, настоящая бяка и окончательная бяка!";
        String target = "бяка";
        String replacement = "[вырезано цензурой]";
        System.out.println(replaceAllWords(text3, target, replacement));
        System.out.println("----------------------------");

        System.out.println("Задание 4:");
        String textLookingFor4 = "Lorem Ipsum";
        System.out.println(countSubstringOccurrences(text, textLookingFor4));
        System.out.println("----------------------------");

        System.out.println("Задание 5:");
        String text5 = text.substring(0, text.indexOf("."));
        System.out.println(reverseWords(text5));
        System.out.println("----------------------------");
    }

    static String findLongestWord(String strIn) {
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

    static boolean checkPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) return true;

        return false;
    }

    static String replaceAllWords(String text, String target, String replacement) {
        if (text == null || text.isEmpty() || target == null || target.isEmpty() ||
                replacement == null || replacement.isEmpty()) {
            return "incorrect input data";
        }
        return text.replace(target, replacement);
    }

    static int countSubstringOccurrences(String text, String substring) {
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

    static String reverseWords(String strIn) {
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
