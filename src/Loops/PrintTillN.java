package Loops;

import java.util.Scanner;

public class PrintTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter i: ");
            int i = sc.nextInt();

            System.out.print("Enter n: ");
            int n = sc.nextInt();
            if (n == -1) {
                System.out.println("Exit");
                break;
            }


            for ( ; i <= n; i++) {
                System.out.println(i);
            }
            System.out.println("Loop breaks at : " + i);
        }
    }
}
