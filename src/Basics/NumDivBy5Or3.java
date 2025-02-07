package Basics;

import java.util.Scanner;

public class NumDivBy5Or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number: ");
            int number = sc.nextInt();
            if (number == -1) {
                System.out.println("EXIT");
                break;
            }
            if (number % 5 == 0 || number % 3 == 0) {
                System.out.println("Number is divisible by 5 or 3");
            } else {
                System.out.println("Number does not meet the condition.");
            }
        }
    }
}
