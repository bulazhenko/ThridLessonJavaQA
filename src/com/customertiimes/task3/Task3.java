package com.customertiimes.task3;

//3. The web is built with HTML strings like "<i>Hello</i>" which draws Hello as italic text.
//   In this example, the "i" tag makes <i> and </i> which surround the word "Hello".
//   Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Hello</i>".
//
//   Task: word = "Welcome to Java World", tag="p"

public class Task3 {

    public static String builtHTML(String html) {
        StringBuffer sb = new StringBuffer(40);
        return sb.append("<p>").append(html).append("</p>").toString();
    }

    public static void main(String[] args) {
        System.out.println("Task 3:");
        String word = "Welcome to Java World";
        System.out.println(builtHTML(word));
    }
}
