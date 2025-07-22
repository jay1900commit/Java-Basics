package Loops;

import java.util.Scanner;

public class APrint {
    public static void main(String[] args) {

        //Upto nth term -> means if n=5, print 5 numbers , A nth term of any Arthmetic progression
        //(AP) is an = a+(n-1)d, a=first term, d=common difference, 1+(5-1)2, ###(2n-1)###.
    //Question : Display the AP- 1 3 5 7 9..upto 'n' terms.
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
         for(int i=1; i<=2*n-1; i+=2){
             System.out.println(i);
         }
    }
}
