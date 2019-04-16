package pracApril2019;

import java.util.Scanner;

public class PrimeNum1 {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        for (int i=2; i<num; i++){
            if(num%i==0){
                System.out.println("Not a prime number");
                break;
            }
            else {
                System.out.println("It is a prime number");
                break;
            }
        }

    }
}
