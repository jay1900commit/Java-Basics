package Basics;

import java.util.Scanner;

public class NestedIfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number: ");
            int number = sc.nextInt();
            if (number == -1) {
                System.out.println("EXIT");
                break;
            }
            if(number%5==0 || number%3==0){
                if(number%15!=0){//30 modulus zero hota ha -->>yahi kah raha ha ki nahi hota ha
                    System.out.println("Number is divisible by 5 or 3 but not by 15");
                }else {
                    System.out.println("Condition does not match");
                }
            }
//            if((number%5==0 || number%3==0) && number%15!=0){
//                System.out.println("Number is divisible by 5 or 3 but not by 15");
//            }else {
//                System.out.println("Condition does not match");
//            }
        }
    }
}
