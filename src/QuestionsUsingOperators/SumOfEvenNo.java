package QuestionsUsingOperators;

import java.util.Scanner;

public class SumOfEvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 2; i <= n; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
}
