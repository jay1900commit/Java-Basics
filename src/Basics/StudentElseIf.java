package Basics;

import java.util.Scanner;

public class StudentElseIf {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks : ");
            int marks = sc.nextInt();

            if (marks==-1){
                System.out.println("Exit");
                break;
            }

            if (marks > 90) {
                System.out.println("Excellent");
            } else if (marks > 80) {
                System.out.println("Vey Good");
            } else if (marks > 70) {
                System.out.println("Good");
            } else if (marks > 60) {
                System.out.println("Can do better");
            } else if (marks > 50) {
                System.out.println("Average");
            } else if (marks > 40) {
                System.out.println("Below Average");
            } else {
                System.out.println("Fail");
            }
        }
    }
}
