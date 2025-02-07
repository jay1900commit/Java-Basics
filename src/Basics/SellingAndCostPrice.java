package Basics;

import java.util.Scanner;

public class SellingAndCostPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter Cost Price");
            double cp = sc.nextDouble();

            if(cp==-1){
                System.out.println("EXIT");
                break;
            }

            System.out.println("Enter Selling Price");
            double sp = sc.nextDouble();

            double profit = sp-cp;
            double loss = cp-sp;

            if(cp<sp){
                System.out.println("Seller makes profit of "+profit);
            }else {
                System.out.println("Sellet incured loss of "+loss);
            }
        }

    }
}
