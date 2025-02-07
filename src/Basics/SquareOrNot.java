package Basics;

import java.util.Scanner;

public class SquareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter length : ");
            int length = sc.nextInt();
            if(length==0){
                System.out.println("EXIT");
                break;
            }
            System.out.println("Enter breadth : ");
            int breadth = sc.nextInt();
            if(length==breadth){
                System.out.println("It is a Square");
            }else {
                System.out.println("It is not a Square");
            }
        }
    }
}
