package Loops;

import java.util.Scanner;

public class PrintEvenFromOneToHundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
//        for(int i=2; i<=n; i++){
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }

        // Optimization: This approach is more efficient since,
        // it avoids unnecessary iterations over odd numbers!
        for(int i=2; i<=n; i+=2){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
