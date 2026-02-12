package part1;

import java.util.Scanner;

public class MoreConditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number :");
        int number = sc.nextInt();

        if (number != 0){
            System.out.println("Number is not equal to zero");
        }
        if(number >= 1000){
            System.out.println("Number is atleast 1000");
        }

    }
}

