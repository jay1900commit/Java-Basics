package Basics;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("Enter Year");
            int year = sc.nextInt();

            if (year == -1) {
                System.out.println("Exit");
                break;
            }

            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not Leap Year");
            }
        }
    }
}
