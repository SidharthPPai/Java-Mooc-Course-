package part1;

import java.util.Scanner;

public class Sumofnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for the first number
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        // Asking for the second number
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        // Asking for the third number
        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());

        // Calculating the sum
        int sum = first + second + third;

        // Printing the result
        System.out.println("The sum of the numbers is " + sum);

        scanner.close();
    }
}