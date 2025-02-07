package Basics;

import java.util.Scanner;

public class TriangleSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first size: ");
            int a = sc.nextInt();

            if (a == -1) {
                System.out.println("EXIT");
                break;
            }

            System.out.println("Enter Second size: ");
            int b = sc.nextInt();

            System.out.println("Enter third size: ");
            int c = sc.nextInt();

            if ((a + b) > c && (b + c) > a && (c + a) > b) {
                System.out.println("Valid triangle");
            } else {
                System.out.println("Invalid triangle");
            }

        }
    }
}
