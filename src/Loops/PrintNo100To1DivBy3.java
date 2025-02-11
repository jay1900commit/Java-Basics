package Loops;

import java.util.Scanner;

public class PrintNo100To1DivBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter i: ");
        int i = sc.nextInt();

        if(i==-1){
            System.out.println("Exit");
        }

        System.out.println("Enter NO: ");
        int n = sc.nextInt();

//        for(; i>=n; i--){
//            if(i%3==0){
//                System.out.println(i);
//            }
//        }

        // Optimization: This approach is more efficient since,
        // it avoids unnecessary iterations over odd numbers!
        for(;i>=n; i-=3){
            System.out.println(i);
        }
    }
}
