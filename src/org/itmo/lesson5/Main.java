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

//        System.out.println("Задание 1:");
//        System.out.println(task1(text));;
//        System.out.println("----------------------------");
//
//        System.out.println("Задание 2:");
//        String firstWord2 = "Ротатор";
//        String secondWord2 = "Рояль";
//        System.out.println(task2(firstWord2));;
//        System.out.println(task2(secondWord2));;
//        System.out.println("----------------------------");

//        System.out.println("Задание 3:");
//        String text3 = "Безо всякого стеснения заявляю: эта бяка — просто бяка, " +
//                "сплошная бяка, настоящая бяка и окончательная бяка!";
//        System.out.println(task3(text3));
//        System.out.println("----------------------------");

        System.out.println("Задание 4:");;
        String firstTextLookingFor4 = "Lorem Ipsum";
        System.out.println(task4(text, firstTextLookingFor4));
        System.out.println("----------------------------");
    }

    static String task1(String strIn) {
        if (strIn == null || strIn.isEmpty()) {
            return "incorrect input data";
        }

        String formattedString = strIn
                .replaceAll("[!\"#$%&'()*+,\\-\\n./:;<=>?@\\[\\\\\\]^_`{|}~]", " ")
                .trim();

        String[] array = formattedString.split(" ");
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

        char[] array = strIn.toLowerCase().toCharArray();
        int count = 1;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - count]) {
                return false;
            }
            count++;
        }
        return true;
    }

    static String task3(String strIn) {
        if (strIn == null || strIn.isEmpty()) {
            return "incorrect input data";
        }
        return strIn.replaceAll("(?i)\\bбяк[а-яё]*\\b", "[вырезано цензурой]");
    }

//    static int task4(String targetText, String textLookingFor) {
//        String formattedString = targetText
//                .replaceAll("[!\"#$%&'()*+,\\-./\\n:;<=>?@\\[\\\\\\]^_`{|}~]", "")
//                .trim()
//                .replace(textLookingFor, " *** ");
//
//        String[] array = formattedString.split(" ");
//        int count = 0;
//
//        for (String s : array) {
//            if (s.equalsIgnoreCase("***")) {
//                count++;
//            }
//        }
//        return count;
//    }

    static int task4(String targetText, String textLookingFor) {
        if (targetText == null || textLookingFor == null || textLookingFor.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = targetText.indexOf(textLookingFor, index)) != -1) {
            count++;
            index += textLookingFor.length();
        }

        return count;
    }
}
