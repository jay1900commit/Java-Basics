package Loops;

import java.util.Scanner;

public class PrintTableN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int i;
        for(i=n; i<=n*10; i+=n){
            System.out.println(i);
        }

    }
}
