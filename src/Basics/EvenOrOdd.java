package Basics;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Number");
            int number = sc.nextInt();

            if(number == -1){
                System.out.println("Exiting Program");
                break;
            }

            if (number % 2 == 0) {
                System.out.println("Number is Even");
            } else {
                System.out.println("Number is Odd");
            }

        }sc.close();

    }
}
