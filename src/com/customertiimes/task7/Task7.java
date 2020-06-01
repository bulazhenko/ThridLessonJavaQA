package com.customertiimes.task7;

//7. Given a user's email address: john_smith@example.com.
// Create two strings "login" and "domain" which will be substrings of full email address.
// The First Name and Last Name of the user should be in the following format: "Name Surname".

public class Task7 {

    public static String pullOutTheName(String email) {
        String name = email.substring(0, email.indexOf("_"));
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        String surname = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        surname = surname.substring(0, 1).toUpperCase() + surname.substring(1);
        return name + " " + surname;
    }

    public static void main(String[] args) {
        System.out.println("Task 7:");

        String emailAddress = "geralt_witcher@example.com";
        System.out.println(pullOutTheName(emailAddress));
    }
}
