package QuestionsUsingOperators;

import java.util.Scanner;

public class ProductOfAllNonZeroDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int product = 1;
        boolean hasNonZeroDigit = false;
        if (n == 0) {
            product = 0;
        }
        while (n != 0) {
            int lastDigit = n % 10;
            if (lastDigit != 0) {
                product = product * lastDigit;
                hasNonZeroDigit = true;
            }
            n /= 10;
        }
        System.out.println(product);
    }
}
