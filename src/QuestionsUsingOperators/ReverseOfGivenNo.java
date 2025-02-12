package QuestionsUsingOperators;

import java.util.Scanner;

public class ReverseOfGivenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            while (n != 0) {
                int lastDigit = n%10;
                System.out.print(lastDigit+" ");
                n/=10;
            }
            System.out.println();

        }
    }
}
