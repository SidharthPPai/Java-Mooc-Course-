package part1;

import java.util.Scanner;

public class ifConditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter speed :");
        int speed = sc.nextInt();

        if(speed > 150){
            System.out.println("Overspeeding speed ticket");
        }else{
            System.out.println("Underspeeding no ticket");
        }

    }
}
