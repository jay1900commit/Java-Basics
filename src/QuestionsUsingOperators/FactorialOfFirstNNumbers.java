package QuestionsUsingOperators;

import java.util.Scanner;

public class FactorialOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter n: ");
            int n = sc.nextInt();
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact*=i;
                System.out.println("Factorial of "+i+" is: "+fact);
            }
        }
    }
}
