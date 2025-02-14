package QuestionsUsingOperators;

import java.util.Scanner;

public class SumOfGivenNoAndReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            int originalValue = n;

            //Right approach
            int rev = 0;
            while (n != 0) {
                int ld = n % 10;
                rev *= 10;
                rev += ld;
                n /= 10;
            }
            System.out.println("Reverse No is: "+rev);
            int sum = (originalValue+rev);
            System.out.println("Sum of n & reverse no. is: "+sum);


        }
    }
}
