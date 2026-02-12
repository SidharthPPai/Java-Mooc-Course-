package part1;

import java.util.Scanner;

public class Valcompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int n1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter second number:");
        int n2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter third number:");
        int n3 = Integer.valueOf(scanner.nextLine());

        if (n1 > n2) {

            if (n1 > n3) {
                System.out.println(n1 + " is the greatest.");
            } else {
                System.out.println(n3 + " is the greatest.");
            }
        } else {

            if (n2 > n3) {
                System.out.println(n2 + " is the greatest.");
            } else {
                System.out.println(n3 + " is the greatest.");
            }
        }

        scanner.close();
    }
}