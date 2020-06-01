package com.customertiimes.task6;

//6. Given 2 strings, a and b. Create a string c of the form short+long+short,
// with the shorter string on the outside and the longer string on the inside.
//
//   Task: a = "hop", b = "hello"

public class Task6 {
    public static String shortLongshort(String strOne, String strTwo) {
        StringBuffer sb = new StringBuffer(40);
        if (strOne.length() == strTwo.length()) {
            System.out.println("Strings are the same lenght!");
            return sb.append(strOne).append(strTwo).append(strOne).toString();
        } else if (strOne.length() < strTwo.length()) {
            return sb.append(strOne).append(strTwo).append(strOne).toString();
        } else {
            return sb.append(strTwo).append(strOne).append(strTwo).toString();
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 6:");

        String a = "hop";
        String b = "hello";
        System.out.println(shortLongshort(a, b));
    }
}
