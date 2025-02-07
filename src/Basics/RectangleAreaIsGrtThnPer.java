package Basics;

import java.util.Scanner;

public class RectangleAreaIsGrtThnPer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter length : ");
            int length = sc.nextInt();
            if(length==0){
                System.out.println("EXIT");
                break;
            }
            System.out.println("Enter breadth : ");
            int breadth = sc.nextInt();
            int area = length * breadth;
            int perimeter = 2 * (length + breadth);
            if (area > perimeter) {
                System.out.println("Area is great");
            } else {
                System.out.println("Perimeter is great");
            }
        }
    }
}
