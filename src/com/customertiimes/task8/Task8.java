package com.customertiimes.task8;

//8. Given a string "Den, John, Will, Kate, Adam, Robin".
// Print all the names from the following string each from a new line.
//   Example:
//   Den
//   John
//   Will
//   Kate
//   ...

public class Task8 {

    public static void sortNames(String names) {
        String[] result;
        result = names.split(", ");
        for (String c : result) {
            System.out.println(c);
        }

    }

    public static void main(String[] args) {
        System.out.println("Task 8:");

        String names = "Den, John, Will, Kate, Adam, Robin";
        sortNames(names);
    }
}
