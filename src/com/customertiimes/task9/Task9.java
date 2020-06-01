package com.customertiimes.task9;

//9. Given some random string s. Verify if that string ends with ".".
// If so, leave this string as is. If not - add it. Test strings create on your own.

public class Task9 {

    public static String verifyEnds(String str) {
        if (str.endsWith(".")) {
            return str;
        } else {
            StringBuilder result = new StringBuilder();
            return result.append(str).append(".").toString();
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 9:");
        String withDot = "Case with dot.";
        String withOutDot = "Here case without dot lol";
        System.out.println("That string ends with \".\" ---> " + verifyEnds(withDot));
        System.out.println("That string ends without \".\" ---> " + verifyEnds(withOutDot));

    }
}