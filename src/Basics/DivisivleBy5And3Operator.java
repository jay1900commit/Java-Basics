package Basics;

import java.util.Scanner;

public class DivisivleBy5And3Operator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter number: ");
            int number = sc.nextInt();
            if(number==-1){
                System.out.println("EXIT");
                break;
            }
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Number is divisible by 5 and 3 both");
            } else {
                System.out.println("Number is not divisible by 5 and 3 both");
            }
        }
    }
}
