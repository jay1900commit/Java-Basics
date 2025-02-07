package Basics;

import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1st number: ");
            int a = sc.nextInt();

            if (a == -1) {
                System.out.println("EXIT");
                break;
            }

            System.out.println("Enter 2nd number: ");
            int b = sc.nextInt();

            System.out.println("Enter 3rd number: ");
            int c = sc.nextInt();

//            if(a>b){
//                if(a>c){
//                    System.out.println("A is greatest");
//                }else{
//                    System.out.println("C is greatest");
//                }
//            }//a<b
//            else if (b>c){
//                System.out.println("B is greatest");
//            }else {
//                System.out.println("C is greatest");
//            }

            //************By Operators******************
            if(a>b && a>c){
                System.out.println("A is greatest");
            } else if (b>a && b>c) {
                System.out.println("B is greatest");
            }else {
                System.out.println("C is greatest");
            }

        }
    }
}
