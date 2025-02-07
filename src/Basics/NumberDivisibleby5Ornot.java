package Basics;

import java.util.Scanner;

public class NumberDivisibleby5Ornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter N");
            int n = sc.nextInt();

            if(n==-1){
                System.out.println("EXIT");
                break;
            }

            if(n%5==0){
                System.out.println("N is divisible by 5");
            }else {
                System.out.println("N is not divisible by 5");
            }
        }

    }
}
