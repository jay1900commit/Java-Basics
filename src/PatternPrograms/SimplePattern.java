package PatternPrograms;

import java.util.Scanner;

public class SimplePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter number of rows: ");
            int m = sc.nextInt();

            System.out.println("Enter number of columns: ");
            int n = sc.nextInt();

            for(int i=1; i<=m; i++){
                for(int j=1; j<=n; j++){
                    System.out.print("*  ");
                }
                System.out.println();
            }
        }
    }
}
