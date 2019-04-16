package pracApril2019;

import java.util.Scanner;

public class ReverseNum1 {
    public static void main(String[]args){
        System.out.println("Enter the number:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int revNum = 0;
        int remainder = 0;


        while (num != 0) {
            remainder = num % 10;
            revNum = revNum * 10 + remainder;
            num=num /10;
            }
        System.out.println(revNum);
        }

}
