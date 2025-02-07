package Basics;

import java.util.Scanner;

public class YoungestAge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Ram Age: ");
            int r = sc.nextInt();

            if (r == -1) {
                System.out.println("EXIT");
                break;
            }

            System.out.println("Enter Shyam Age: ");
            int s = sc.nextInt();

            System.out.println("Enter Ajay Age: ");
            int a = sc.nextInt();

            if(r<s && r<a){
                System.out.println("Ram is Youngest");
            } else if (s<r && s<a) {
                System.out.println("Shyam is Youngest");
            }else {
                System.out.println("Ajay is Youngest");
            }
        }
    }
}
