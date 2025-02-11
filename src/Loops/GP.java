package Loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter n: ");
            int n = sc.nextInt();

            if(n==-1){
                System.out.println("Exit");
                break;
            }

            System.out.println("Enter first term: ");
            int a = sc.nextInt();

            System.out.println("Enter common ratio: ");
            int r = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println(a + " ");
                a*=r;
            }
        }
    }
}
