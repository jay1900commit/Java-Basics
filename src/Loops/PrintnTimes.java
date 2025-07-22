package Loops;

import java.util.Scanner;

public class PrintnTimes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter n: ");
            int n = sc.nextInt();

            if(n==-1){
                System.out.println("Exit");
                break;
            }
            for (int i = 1; i <= n; i++) {
                System.out.println("Hello");
            }
        }
    }
}
