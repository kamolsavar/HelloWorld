import java.util.Scanner;

public class PositiveNegativeNumber {

    public static void main(String[] args) {
        System.out.println("Please enter your number:");
        Scanner scan= new Scanner(System.in);
        int num= scan.nextInt();

        if (num>0){
            System.out.println("The number is a positive");
        }
        else if(num<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The numebr is Zero");
        }

    }
}
