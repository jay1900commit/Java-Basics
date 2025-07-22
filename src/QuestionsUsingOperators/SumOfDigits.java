package QuestionsUsingOperators;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {


        //n % 10 extracts the last digit.
        //n /= 10 removes the last digit.


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int ld = n % 10;
            sum += ld;
            n/=10;
        }
        System.out.println(sum);
    }

}
