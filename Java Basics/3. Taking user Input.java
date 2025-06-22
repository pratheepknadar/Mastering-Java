package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String first_name, last_name;
        System.out.println("Enter your first name: ");
        first_name= user_input.next();
        System.out.println("Enter your last name: ");
        last_name = user_input.next();
        System.out.println("Hello, " + first_name + " How are you ?");
    }
}