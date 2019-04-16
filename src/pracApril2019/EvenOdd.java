package pracApril2019;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[]args){
        System.out.println("Enter your number:");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();

        for (int i=1; i<=100;i++){
            if(num%2==0){
                System.out.println(num+" is an Even Number");
                break;
            }

            else{
                System.out.println(num+" is an odd number");
                break;
            }
        }

    }
}
