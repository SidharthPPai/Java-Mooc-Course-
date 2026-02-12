package part1;

import java.util.Scanner;

public class Secondsinaday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        // Reading the integer input from the user
        int days = Integer.valueOf(scanner.nextLine());

        // Calculate seconds: days * hours * minutes * seconds
        int seconds = days * 24 * 60 * 60;

        // Print the result
        System.out.println(seconds);

        scanner.close();
    }
}