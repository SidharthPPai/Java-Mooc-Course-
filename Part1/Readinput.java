package part1;

import java.util.Scanner;

public class Readinput {
    public static void main(String[] args) {

        // Create a tool for reading user input and name it scanner
        Scanner sc = new Scanner(System.in);

        // Print write a message
        System.out.println("Write Message : ");

        // Read the string given by the user and assign it
        String message = sc.nextLine();

        // Print the message written by the user
        System.out.println(message);


        // Concatination we use + to combine two strings
        System.out.println("Hello" + "world");

        String start = "My name is ";
        String end = "Karthik pai";

        System.out.println(start + "pai" + end);
    }
}
