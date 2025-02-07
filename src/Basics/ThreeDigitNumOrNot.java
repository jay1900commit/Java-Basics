package Basics;

import java.util.Scanner;

public class ThreeDigitNumOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number: ");
            int number = sc.nextInt();
            if (number==-1) {
                System.out.println("EXIT");
                break;
            }
            if (number < 10) {
                System.out.println("Number is one digit number");
            } else if (number > 9 && number < 100) {
                System.out.println("Number is two digit number");
            } else if (number > 99 && number < 1000) {
                System.out.println("Number is three digit number");
            } else {
                System.out.println("Number is greater then three digit number");
            }
        }
    }
}
