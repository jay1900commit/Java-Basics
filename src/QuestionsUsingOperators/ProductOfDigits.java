package QuestionsUsingOperators;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int product =1;
        if(n==0){
            product=0;
        }
        while (n!=0){
            int lastDigit = n%10;
            product = product*lastDigit;
            n/=10;
        }
        System.out.println(product);
    }
}
