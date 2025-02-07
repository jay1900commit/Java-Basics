package Basics;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Num: ");
            int num = sc.nextInt();
            if(num==0){
                System.out.println("Exit");
                break;
            }
            if (num < 0) {
                num = -num;
            }
            System.out.println(num);
        }
    }
}
