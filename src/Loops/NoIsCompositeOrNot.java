package Loops;

import java.util.Scanner;

public class NoIsCompositeOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            if(n==-1){
                System.out.println("Exit");
                break;
            }
            boolean flag = false;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = true;
                    break;
                }
            }
            if(n==1){
                System.out.println("Neither prime nor composite");
            }else if (flag == false) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Composite Number");
            }
        }
    }
}
