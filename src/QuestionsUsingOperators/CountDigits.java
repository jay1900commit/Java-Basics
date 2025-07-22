package QuestionsUsingOperators;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int count = 0;

        if(n==0){
            count++;
        }
        while (n!=0){
            n=n/10;
            count++;
        }

        //The purpose of the loop is to count the number
        // of digits in n, not to iterate over a fixed range.
//        for(; n!=0; n/=10){
//            count++;
//        }

        System.out.println(count);

    }
}
