package QuestionsUsingOperators;

import java.util.Scanner;

public class ReverseOfGivenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            //All test cases are not working
//            while (n != 0) {
//                int lastDigit = n%10;
//                System.out.print(lastDigit+" ");
//                n/=10;
//            }

            //Right approach
            int rev = 0;
            while (n != 0) {
                int ld = n%10;
                rev*=10;
                rev+=ld;
                n/=10;
            }
            System.out.println(rev);

        }
    }
}
