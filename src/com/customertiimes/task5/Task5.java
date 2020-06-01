package com.customertiimes.task5;
//5. Given a string "ABCDEFGHIJK". You need to make this string lowercased and remove all vowels.

public class Task5 {
    public static String setLowerCase(String upperCase) {
        String result = upperCase.replaceAll("[AEIOUY]", "");
        return result.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println("Task 5:");
        String upperCase = "ABCDEFGHIJK";
        System.out.println(setLowerCase(upperCase));
    }
}

