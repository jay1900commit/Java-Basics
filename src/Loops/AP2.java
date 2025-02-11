package Loops;

import java.util.Scanner;

public class AP2 {
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

            System.out.println("Enter common difference: ");
            int d = sc.nextInt();

            //Optimization: This approach is more efficient since,
            // it don't need maths formula an=a+(n-1)d
            //we can print any AP by this below approach
            //here we don't relay on i, instead of that we print first term (a) and simply
            // add common difference (d)

            for (int i = 1; i <= n; i++) {
                System.out.println(a + " ");
                a = a + d;
            }
        }
    }
}
