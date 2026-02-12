package part1;

import java.util.Scanner;

// Program that reads the message nextline()
public class ReadString {
    public static void main(String[] args) {

        // Create the tool for reading , assign it to variable sc
        Scanner sc = new Scanner(System.in);

        // Print user a message "Write a message"
        System.out.println("Write a message : ");

        // Read the user's String input save it to program memory
        String message = sc.nextLine();

        // Print the user input twice
        System.out.println(message);
        System.out.println(message);
    }
}
