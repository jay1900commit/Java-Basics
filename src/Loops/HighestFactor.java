package Loops;

import java.util.Scanner;

public class HighestFactor {
    public static void main(String[] args) {

        //Highest factor other than n

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int hf = 1;

//        for(int i=1; i<n; i++){
//            if(n%i==0){
//                hf=i;
//            }
//        }
//        System.out.println(hf);

        //optimise code

        for (int i = n-1; i>=1; i--) {
            if(n%i==0){
                hf=i;
                break;
            }
        }
        System.out.println(hf);
    }
}
