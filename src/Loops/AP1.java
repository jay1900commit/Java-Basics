package Loops;

import java.util.Scanner;

public class AP1 {
    public static void main(String[] args) {

        //Upto nth term -> means if n=5, print 5 numbers , A nth term of any Arthmetic progression
        //(AP) is an = a+(n-1)d, a=first term, d=common difference, 4+(n-1)3, ###(3n+1)###.
        //Question : Display the AP- 4 7 10 13 16..upto 'n' terms.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for(int i=4; i<=3*n+1; i+=3){
            System.out.println(i);
        }


    }
}
